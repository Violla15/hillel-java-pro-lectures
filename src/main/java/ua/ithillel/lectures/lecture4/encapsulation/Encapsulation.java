package ua.ithillel.lectures.lecture4.encapsulation;

public class Encapsulation {

    private int myInt = 5;
    String myString = "a";
    protected String myProtectedString = "A";
    public long myLong = 15;

    public static String staticString = "AAA";

    static {
        System.out.println("static output");
    }

    private void method() {
        myInt = 6;

    }

    public Encapsulation() {

    }

}
