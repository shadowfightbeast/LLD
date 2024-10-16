package models;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private String name;
    private List<Event> events;

    public Calendar(String name) {
        this.name = name;
        this.events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void removeEvent(Event event) {
        events.remove(event);
    }

    public List<Event> getEvents() {
        return events;
    }

    public String getName() {
        return name;
    }

}
