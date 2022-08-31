package ua.ithillel.lectures.lecture24.entity;

public enum Role {
    ADMIN(1),
    MANAGER(2),
    CLIENT(3);

    private final int value;

    Role(int value) {
        this.value = value;
    }
}
