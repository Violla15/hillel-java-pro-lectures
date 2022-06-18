package ua.ithillel.homeworks.homework2;

import java.util.Arrays;
import java.util.Random;

public class Homework2 {

    public static void main(String[] args) {
        printHelloWorld();
        System.out.println();
        findAvarage();
        int array[] = {2,4,8};
        System.out.println(Arrays.toString(getIndexes(array, 6)));

    }

    private static void printHelloWorld() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("HelloWorld ");
            } else if (i % 3 == 0) {
                System.out.print("Hello ");
            } else if (i % 5 == 0) {
                System.out.print("World ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    private static void findAvarage() {
        int[] array = new int[10];
        int sum = 0;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 21);
            sum += array[i];
        }

        System.out.println("Avarage is " + sum / array.length);
    }

    private static int[] getIndexes(int[] numbers, int target) {
        int[] result = {-1, -1};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return result;
    }

}
