package ua.ithillel.lectures.lecture20;

import lombok.AllArgsConstructor;
import ua.ithillel.lectures.lecture19.account.Account;
import ua.ithillel.lectures.lecture19.account.InsufficientFundsException;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

@AllArgsConstructor
public class Transfer implements Callable<Boolean> {

    private final int id;
    private final Account accountFrom;
    private final Account accountTo;
    private final int amount;

    @Override
    public Boolean call() throws Exception {
        System.out.println("Transfer with id " + id + " started");

        if (accountFrom.getBalance() < amount) {
            throw new InsufficientFundsException("Insufficient funds , less than " + amount);
        }

        if (accountFrom.getLock().tryLock(5, TimeUnit.SECONDS)) {
            Thread.sleep(1000);
            try {
                if (accountTo.getLock().tryLock(5, TimeUnit.SECONDS)) {
                    try {
                        accountFrom.withdraw(amount);
                        accountTo.deposit(amount);

                        System.out.println("Transfer with id " + id + " successful : ");
                        System.out.println("Account 1 balance = " + accountFrom.getBalance());
                        System.out.println("Account 2 balance = " + accountTo.getBalance());

                    } catch (Exception e) {
                        e.printStackTrace();
                        return false;
                    } finally {
                        accountTo.getLock().unlock();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            } finally {
                accountFrom.getLock().unlock();
            }
        }

        return true;
    }
}
