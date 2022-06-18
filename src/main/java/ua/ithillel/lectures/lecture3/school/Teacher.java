package ua.ithillel.lectures.lecture3.school;

import java.util.List;

public class Teacher extends SchoolMember {

    private int experience;
    private List<String> groups;

    public Teacher() {
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return super.toString() + " experience : " + experience;
    }
}
