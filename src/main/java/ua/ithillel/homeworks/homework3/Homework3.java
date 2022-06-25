package ua.ithillel.homeworks.homework3;

import ua.ithillel.lectures.lecture3.school.SchoolMember;
import ua.ithillel.lectures.lecture3.school.Student;
import ua.ithillel.lectures.lecture3.school.StudyGroup;
import ua.ithillel.lectures.lecture3.school.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Homework3 {

    public static void main(String[] args) {
        StudyGroup javaGroup = new StudyGroup("Java Pro");
        StudyGroup pythonGroup = new StudyGroup("Python");
        StudyGroup qaGroup = new StudyGroup("QA");

        List<StudyGroup> student1Groups = new ArrayList<>();
        student1Groups.add(javaGroup);
        student1Groups.add(pythonGroup);
        student1Groups.add(qaGroup);

        Student student = new Student();
        student.setName("Ivan");
        student.setGroups(student1Groups);

        Student student2 = new Student();
        student2.setName("Stepan");
        student2.setGroups(List.of(javaGroup, qaGroup));

        Teacher teacher = new Teacher();
        teacher.setName("Oleg");
        teacher.setGroups(List.of(javaGroup));

        Teacher teacher2 = new Teacher();
        teacher2.setName("Nikolia");
        teacher2.setGroups(List.of(qaGroup));

        List<SchoolMember> members = List.of(student, student2, teacher, teacher2);
        printSchoolMembersGroups(members);
    }

    private static void printSchoolMembersGroups(List<SchoolMember> schoolMembers) {
        for (SchoolMember schoolMember : schoolMembers) {
            System.out.println(schoolMember);
            System.out.println("Groups : ");
            for (StudyGroup group : schoolMember.getGroups()) {
                System.out.print(group.getName() + " ");
            }
            System.out.println();
        }
    }
}
