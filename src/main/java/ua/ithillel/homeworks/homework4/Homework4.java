package ua.ithillel.homeworks.homework4;

import ua.ithillel.lectures.lecture4.FractionNumber;

public class Homework4 {
    public static void main(String[] args) {
        FractionNumber fractionNumber = new FractionNumber(/*1,3*/);
        FractionNumber plusResult = fractionNumber.plus(new FractionNumber(/*2,3*/));
        System.out.println("Plus operation result is " + plusResult);
    }
}
