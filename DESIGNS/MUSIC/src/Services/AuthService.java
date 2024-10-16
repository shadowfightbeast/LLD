package Services;

import java.util.HashMap;
import java.util.Map;

import models.User; //change this user to actual design user

public class AuthService {
    private Map<String, User> usersDatabase;

    public AuthService() {
        this.usersDatabase = new HashMap<>();
    }

    public boolean registerUser(String username, String password, String email) {
        if (usersDatabase.containsKey(username)) {
            return false; // User already exists
        }
        usersDatabase.put(username, new User(username, password, email));
        return true;
    }

    public User loginUser(String username, String password) {
        User user = usersDatabase.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
