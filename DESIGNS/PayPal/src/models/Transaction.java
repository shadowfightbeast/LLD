package models;

import java.sql.Date;

public class Transaction {
    private String transactionId;
    private double amount;
    private String fromUserId;
    private String toUserId;
    private Date timestamp;
    private String type; // Can be DEPOSIT, WITHDRAW, TRANSFER

    public Transaction(String transactionId, double amount, String fromUserId, String toUserId, String type) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.timestamp = new Date(0);
        this.type = type;
    }

    // Getters
    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public String getToUserId() {
        return toUserId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getType() {
        return type;
    }
}
