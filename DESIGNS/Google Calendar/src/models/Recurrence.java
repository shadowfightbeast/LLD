package models;

import java.time.LocalDateTime;

public class Recurrence {

    private RecurrenceType recurrenceType;
    private int interval; // Number of intervals (e.g., every 1 day, every 2 weeks)
    private LocalDateTime until; // Optional end date for recurrence

    public Recurrence(RecurrenceType recurrenceType, int interval, LocalDateTime until) {
        this.recurrenceType = recurrenceType;
        this.interval = interval;
        this.until = until;
    }

    // Getters and Setters
}
