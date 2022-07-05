package ua.ithillel.lectures.lecture8;

import ua.ithillel.lectures.lecture8.hashmap.Employee;
import ua.ithillel.lectures.lecture8.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lecture8 {

    public static void main(String[] args) {
        // Maps
        // maps();
        //mapEqualsHashcode();
        // Tree
        tree();
    }

    private static void tree() {
        Tree root = new Tree(5);
        Tree rootLeft = new Tree(7);
        Tree rootRight = new Tree(9);

        Tree rootLeftLeft = new Tree(10);
        Tree rootLeftRight = new Tree(6);

        Tree rootRightRight = new Tree(1);

        rootRightRight.setRight(new Tree(2));
        rootRightRight.setLeft(new Tree(3));
        rootRight.setRight(rootRightRight);

        rootLeft.setLeft(rootLeftLeft);
        rootLeft.setRight(rootLeftRight);

        root.setLeft(rootLeft);
        root.setRight(rootRight);

        System.out.println("sum is " + root.sum());
    }

    private static void mapEqualsHashcode() {
        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee(1);

        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());

        Map<Employee, String> employeeMap = new HashMap<>();
        employeeMap.put(emp1, "Jack");
        employeeMap.put(emp2, "Nick");

        System.out.println(employeeMap.size());
        System.out.println(employeeMap.size());

        for (Map.Entry<Employee, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void maps() {
        Map<String, Integer> exampleMap = new HashMap<>();
        String a = "a";
        String b = "A";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        exampleMap.put("a", 1);

        Map<String, String> birthdayMap = new HashMap<>();
        birthdayMap.put("Oleg", "07.12.1987");
        birthdayMap.put("Kate", "07.09.1991");
        birthdayMap.put("Igor", "02.11.1995");

        System.out.println("HashMap entries : ");
        for (Map.Entry<String, String> entry : birthdayMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<String, String> birthdayLinkedHashMap = new LinkedHashMap<>();
        birthdayLinkedHashMap.put("Oleg", "07.12.1987");
        birthdayLinkedHashMap.put("Kate", "07.09.1991");
        birthdayLinkedHashMap.put("Igor", "02.11.1995");

        System.out.println("LinkedHashMap entries : ");
        for (Map.Entry<String, String> entry : birthdayLinkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
