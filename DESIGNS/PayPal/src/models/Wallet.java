package models;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private String walletId;
    private double balance;
    private List<Transaction> transactions;

    // methods for deposit, withdraw, transfer
    public Wallet(String walletId) {
        this.walletId = walletId;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}