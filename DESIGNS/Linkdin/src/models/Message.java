package models;

import java.security.Timestamp;

public class Message {
    private final String id;
    private final User sender;
    private final User receiver;
    private final String content;
    private final java.sql.Timestamp timestamp;

    public Message(String id, User sender, User receiver, String content, java.sql.Timestamp timestamp2) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timestamp = timestamp2;
    }
}
