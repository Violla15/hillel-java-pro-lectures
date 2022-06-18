package ua.ithillel.lectures.lecture3;

import ua.ithillel.lectures.lecture3.school.Student;
import ua.ithillel.lectures.lecture3.school.Teacher;

import java.util.List;

public class Lecture3 {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Oleg");
        student.setSurname("Oleinik");
        student.setAge(25);
        student.setEmail("oleg@gmail.com");
        student.setGroups(List.of("QA", "JAVA"));
        System.out.println("Student = " + student);

        Teacher teacher = new Teacher();
        teacher.setName("Ivan");
        teacher.setSurname("Ivanov");
        teacher.setAge(30);
        teacher.setEmail("ivanov@gmail.com");
        teacher.setExperience(3);
        System.out.println("Teacher = " + teacher);
    }

}
