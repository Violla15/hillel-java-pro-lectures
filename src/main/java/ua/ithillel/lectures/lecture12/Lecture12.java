package ua.ithillel.lectures.lecture12;

import ua.ithillel.lectures.lecture12.builder.Phone;
import ua.ithillel.lectures.lecture12.chain.ATM;
import ua.ithillel.lectures.lecture12.chain.Currency;
import ua.ithillel.lectures.lecture12.singleton.UserSession;

import java.util.Scanner;


public class Lecture12 {

    public static void main(String[] args) {
        // Singleton
        //singleton();

        // Builder
        //builder();

        // Chain of responsibilities
        chainOfResponsibilities();
    }

    private static void chainOfResponsibilities() {
        ATM atm = new ATM();
        while (true) {
            int amount;
            System.out.println("Enter sum to withdraw ");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10.");
                return;
            }

            atm.billsChain.give(new Currency(amount));
        }
    }

    private static void builder() {
        Phone phone = new Phone.PhoneBuilder("CX-50", "Samsung")
                .storage(256)
                .isUsed(false)
                .year(2015)
                .pixels(13)
                .build();

        System.out.println(phone);
    }

    private static void singleton() {
        UserSession userSession = UserSession.getInstance();
        System.out.println("Username = " + userSession.getUsername());
    }
}
