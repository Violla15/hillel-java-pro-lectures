package ua.ithillel.lectures.lecture4.immutable;

import java.util.Arrays;

// Declare as final
public final class ImmutableStudent {

    // Mark all fields as private and final
    private final String name;
    private final String email;
    private final String[] groups;

    // Pass all fields in constructor
    public ImmutableStudent(String name, String email, String[] groups) {
        this.name = name;
        this.email = email;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // For arrays/collections return copy
    public String[] getGroups() {
        String [] arraysCopy = new String[this.groups.length];
        System.arraycopy(groups, 0, arraysCopy, 0, groups.length);
        return arraysCopy;
    }

    @Override
    public String toString() {
        return "ImmutableStudent{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
