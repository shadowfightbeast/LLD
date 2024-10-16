package models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private String password;
    private List<Calendar> calendars;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.calendars = new ArrayList<>();
    }

    public void addCalendar(Calendar calendar) {
        calendars.add(calendar);
    }

    public List<Calendar> getCalendars() {
        return calendars;
    }

    public Object getPassword() {
        return password;
    }

    public String getUserName() {
        return username;
    }

    // Getters and Setters
}
