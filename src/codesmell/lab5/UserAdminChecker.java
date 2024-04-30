package codesmell.lab5;

public class UserAdminChecker {
    public boolean isAdmin(User user) {
        return user.getUsername().contains("admin");
    }
}
