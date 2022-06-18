package ua.ithillel.lectures.lecture3.school;

import java.util.List;

public class Student extends SchoolMember {

    private List<String> groups;

    public Student() {

    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

}
