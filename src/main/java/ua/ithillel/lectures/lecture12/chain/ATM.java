package ua.ithillel.lectures.lecture12.chain;

import ua.ithillel.lectures.lecture12.chain.bill.UAH100Bill;
import ua.ithillel.lectures.lecture12.chain.bill.UAH10Bill;
import ua.ithillel.lectures.lecture12.chain.bill.UAH20Bill;
import ua.ithillel.lectures.lecture12.chain.bill.UAH50Bill;

public class ATM {

    public Chain billsChain;

    public ATM() {
        // initialize the chain
        this.billsChain = new UAH100Bill();
        Chain c2 = new UAH50Bill();
        Chain c3 = new UAH20Bill();
        Chain c4 = new UAH10Bill();

        // set chain of responsibilities
        billsChain.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
    }
}
