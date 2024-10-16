package services;

import models.BankAccount;

public class BankService {
    public boolean linkBankAccount(String userId, BankAccount bankAccount) {
        return true;
    }

    public boolean unlinkBankAccount(String userId, String bankAccountId) {
        return false;
    }

    public double checkBankBalance(String bankAccountId) {
        return 8.1;
    }
}
