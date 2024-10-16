package services;

import models.Wallet;
import models.Transaction;
import models.User;

public class WalletService {

    public void deposit(User user, double amount) {
        Wallet wallet = user.getWallet();
        wallet.deposit(amount);
        wallet.addTransaction(
                new Transaction("T" + System.currentTimeMillis(), amount, null, user.getUserId(), "DEPOSIT"));
        System.out.println("Deposited " + amount + " into wallet. New balance: " + wallet.getBalance());
    }

    public void withdraw(User user, double amount) {
        Wallet wallet = user.getWallet();
        wallet.withdraw(amount);
        wallet.addTransaction(
                new Transaction("T" + System.currentTimeMillis(), amount, user.getUserId(), null, "WITHDRAW"));
        System.out.println("Withdrawn " + amount + " from wallet. New balance: " + wallet.getBalance());
    }

    public void transfer(User fromUser, User toUser, double amount) {
        Wallet fromWallet = fromUser.getWallet();
        Wallet toWallet = toUser.getWallet();

        fromWallet.withdraw(amount);
        toWallet.deposit(amount);

        Transaction transaction = new Transaction("T" + System.currentTimeMillis(), amount, fromUser.getUserId(),
                toUser.getUserId(), "TRANSFER");
        fromWallet.addTransaction(transaction);
        toWallet.addTransaction(transaction);

        System.out.println("Transferred " + amount + " from " + fromUser.getName() + " to " + toUser.getName());
    }
}
