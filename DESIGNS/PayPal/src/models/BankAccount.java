package models;

public class BankAccount {
    private String bankAccountId;
    private String bankName;
    private String accountNumber;
    private double balance;

    public BankAccount(String bankAccountId, String bankName, String accountNumber, double balance) {
        this.bankAccountId = bankAccountId;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and Setters
    public String getBankAccountId() {
        return bankAccountId;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
