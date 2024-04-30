package codesmell.lab5;

import java.util.ArrayList;
import java.util.List;

public class UserListProcessor {
    private ArrayList<User> users;
    private UserAdminChecker adminChecker;

    public UserListProcessor(ArrayList<User> users) {
        this.users = users;
        this.adminChecker = new UserAdminChecker();
    }

    public void processUserList() {
        for (User user : users) {
            processUser(user);
        }
    }

    private void processUser(User user) {
        System.out.println("Processing user: " + user.getUsername());
        if (adminChecker.isAdmin(user)) {
            System.out.println("Admin user detected!");
        }
    }

    public int countAdminUsers() {
        int count = 0;
        for (User user : users) {
            if (adminChecker.isAdmin(user)) {
                count++;
            }
        }
        return count;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void sendEmailToUser(User user) {
        System.out.println("Sending email to user: " + user.getUsername() + " at " + user.getEmail());
    }

    public List<User> getUsers() {
        return users;
    }
}