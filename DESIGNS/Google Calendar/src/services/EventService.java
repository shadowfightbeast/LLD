package services;

import models.Event;
import models.Calendar;

import java.time.LocalDateTime;
import java.util.*;

public class EventService {
    public void createEvent(Calendar calendar, Event event) {
        calendar.addEvent(event);
    }

    public void updateEvent(Event event, String newTitle, String newDescription, LocalDateTime newStartTime,
            LocalDateTime newEndTime) {
        event.updateEvent(newTitle, newDescription, newStartTime, newEndTime);
    }

    public void deleteEvent(Calendar calendar, Event event) {
        calendar.removeEvent(event);
    }

    public List<Event> getEventsByCalendar(Calendar calendar) {
        return calendar.getEvents();
    }
}
