package ua.ithillel.lectures.lecture2;

import java.util.Arrays;

public class Lecture2 {

    public static void main(String[] args) {
        int a = 7;

        if (a >= 5) {
            System.out.println("a > 5");
        } else {
            System.out.println("else");
        }

        String myString = "A";
        // byte, short, char, int
        // Byte, Short, Character, Integer
        // String (starting from Java 7)
        // Enum
        switch (myString) {
            case "A":
                System.out.println("a is 5");
                break;
            case "B":
                System.out.println("a is 6");
                break;
            default:
                System.out.println("default");
                break;
        }
        System.out.println(getDayOfWeek(7));

        // Arrays
        int[] myArray = new int[2];
        myArray[0] = 1;
        myArray[1] = 2;
        // myArray[2] = 3;

        System.out.println(Arrays.toString(myArray));
        //doWhile();

        for (int i = 0; i <= 10; i++) {

        }
        drawSquare(5);

        // Clean code
        // Packages
        // com.google
        // service.manager
        // Classes (camel case)
        // LectureTwo
        // Variables and method arguments (camel case)
        // int myValue
        // Methods (camel case)
        // void drawSquare()
    }

    private static void drawSquare(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(" ");
            for (int j = 0; j < size; j++) {
                System.out.print("# ");
            }
        }
    }

    private static void doWhile() {
        int i = 0;
        do {
            i++;
            System.out.println("i = " + i);
        } while (i != 10);

        while (i != 0) {
            i--;
            System.out.println("i = " + i);
        }
    }


    private static String getDayOfWeek(int dayNumber) {
        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return days[dayNumber - 1];
    }

}
