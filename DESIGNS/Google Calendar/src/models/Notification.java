package models;

import java.time.LocalDateTime;

public class Notification {
    private String message;
    private LocalDateTime notificationTime;

    public Notification(String message, LocalDateTime notificationTime) {
        this.message = message;
        this.notificationTime = notificationTime;
    }

    public void sendNotification() {
        // Logic to send notification (e.g., print to console or trigger a real
        // notification system)
        System.out.println("Reminder: " + message + " at " + notificationTime);
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationTime(LocalDateTime notificationTime) {
        this.notificationTime = notificationTime;
    }
}
