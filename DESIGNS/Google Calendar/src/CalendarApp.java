import models.User;

import java.time.LocalDateTime;

import models.Calendar;
import models.Notification;
import models.Event;
import models.Recurrence;
import services.EventService;
import services.SyncService;
import services.UserService;

public class CalendarApp {
    public static void main(String[] args) {
        UserService userService = new UserService();
        EventService eventService = new EventService();
        SyncService syncService = new SyncService();

        // Register and log in user
        userService.registerUser("john_doe", "john@example.com", "password123");
        User user = userService.loginUser("john_doe", "password123");

        Calendar personalCalendar = new Calendar("personal calendar");
        userService.addCalendarToUser(user, personalCalendar);

        LocalDateTime eventStart = LocalDateTime.of(2024, 10, 1, 10, 0);
        LocalDateTime eventEnd = LocalDateTime.of(2024, 10, 1, 11, 0);
        Recurrence recurrence = new Recurrence(Recurrence.RecurrenceType.DAILY, 1, LocalDateTime.of(2025, 1, 1, 0, 0));
        Event meeting = new Event("Team Meeting", "Discuss project updates", eventStart, eventEnd, recurrence);

        eventService.createEvent(personalCalendar, meeting);

        // Add notification to the event
        // Notification notification = new Notification("Team meeting starting soon",
        // eventStart.minusMinutes(15));
        // meeting.addNotification(notification);

        // Update the event
        LocalDateTime newEventStart = LocalDateTime.of(2024, 10, 1, 10, 30);
        eventService.updateEvent(meeting, "Team Meeting - Update", "Discuss new project details", newEventStart,
                eventEnd);

        // Sync calendar across devices
        syncService.syncCalendarAcrossDevices(user);

        // Display upcoming events
        System.out.println("upcoming events");
        for (Event event : personalCalendar.getEvents()) {
            System.out.println("Event: " + event.getTitle() + " at " + event.getStartTime());
        }

        // Send notification
        // notification.sendNotification();

    }
}
