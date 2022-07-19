package ua.ithillel.lectures.lecture12.singleton;

public class UserSession {

    private String username;
    private boolean isAdmin;
    private static UserSession instance;

    private UserSession() {
        this.username = "Stepan";
        this.isAdmin = true;
    }

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public String toString() {
        return "UserSession{" +
                "username='" + username + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
