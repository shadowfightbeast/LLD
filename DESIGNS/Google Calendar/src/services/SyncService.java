package services;

import models.Calendar;

import models.User;

public class SyncService {
    // Logic to sync calendar data from the server to all connected devices
    public void syncCalendarAcrossDevices(User user) {
        System.out.println("syncing calendar for user" + user.getUserName());
        for (Calendar calendar : user.getCalendars()) {
            System.out.println("synced calendar" + calendar.getName());
        }
    }
}
