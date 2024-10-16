package models;

import java.time.LocalDateTime;
import java.util.List;

public class Event {
    private String title;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Recurrence recurrence;
    private List<Notification> notifications;

    public Event(String title, String description, LocalDateTime startTime, LocalDateTime endTime,
            Recurrence recurrence) {
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.recurrence = recurrence;
    }

    // Add notifications for event
    public void addNotification(Notification notification) {
        notifications.add(notification);
    }

    public void updateEvent(String title, String description, LocalDateTime startTime, LocalDateTime endTime) {
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    // Getters and Setters
}
