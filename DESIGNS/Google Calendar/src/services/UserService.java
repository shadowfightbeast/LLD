package services;

import java.util.HashMap;
import java.util.Map;

import models.Calendar;
import models.User;

public class UserService {
    private Map<String, User> userDatabase = new HashMap<>();

    public boolean registerUser(String username, String email, String password) {
        if (userDatabase.containsKey(username)) {
            return false; // User already exists
        }
        userDatabase.put(username, new User(username, email, password));
        return true;
    }

    public User loginUser(String username, String password) {
        User user = userDatabase.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public void addCalendarToUser(User user, Calendar calendar) {
        user.addCalendar(calendar);
    }
}
