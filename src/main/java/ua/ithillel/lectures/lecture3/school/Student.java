package ua.ithillel.lectures.lecture3.school;


public class Student extends SchoolMember {

    public Student() {

    }

    @Override
    public String toString() {
        return "Student " + getName();
    }
}
