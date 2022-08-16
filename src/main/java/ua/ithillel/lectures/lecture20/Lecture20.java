package ua.ithillel.lectures.lecture20;

import ua.ithillel.lectures.lecture19.account.Account;
import ua.ithillel.lectures.lecture20.semaphore.CommonResource;
import ua.ithillel.lectures.lecture20.semaphore.CountThread;

import java.util.Random;
import java.util.concurrent.*;

public class Lecture20 {

    public static void main(String[] args) {
     // executorServices();
      semaphore();
    }

    private static void semaphore() {
        Semaphore semaphore = new Semaphore(1);
        CommonResource commonResource = new CommonResource();

        new Thread(new CountThread(commonResource, semaphore, "CountTread 1")).start();
        new Thread(new CountThread(commonResource, semaphore, "CountTread 2")).start();
        new Thread(new CountThread(commonResource, semaphore, "CountTread 3")).start();
    }

    private static void executorServices() {
        Account account1 = new Account(2500);
        Account account2 = new Account(2000);

        Random random = new Random();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            executorService.submit(new Transfer(i, account1, account2, random.nextInt(200)));
        }

        executorService.shutdown();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);

        for (int i = 0; i < 10; i++) {
            scheduledExecutorService.schedule(new Transfer(i, account1, account2, random.nextInt(200)), 3, TimeUnit.SECONDS);
        }

        scheduledExecutorService.shutdown();
    }
}
