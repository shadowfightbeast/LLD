package models;

import java.security.Timestamp;
import java.util.List;

public class Notification {
    private final String id;
    private final User user;
    private final NotificationType type;
    private final String content;
    private final java.sql.Timestamp timestamp;

    public Notification(String id, User user, NotificationType type, String content, java.sql.Timestamp timestamp2) {
        this.id = id;
        this.user = user;
        this.type = type;
        this.content = content;
        this.timestamp = timestamp2;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public NotificationType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public java.sql.Timestamp getTimestamp() {
        return timestamp;
    }

    public List<Notification> computeIfAbsent(String userId, Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'computeIfAbsent'");
    }
}
