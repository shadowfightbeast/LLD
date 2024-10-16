package LowLevelDesign.DesignATM.ATMStates;

import LowLevelDesign.DesignATM.ATM;
import LowLevelDesign.DesignATM.Card;
import LowLevelDesign.DesignATM.TransactionType;

public abstract class ATMState {

    public void insertCard(ATM atm, Card card) {
        System.out.println("please select your select operation  type");
    }

    public void authenticatePin(ATM atm, Card card, int pin) {
        System.out.println("Transaction processing");
    }

    public void selectOperation(ATM atm, Card card, TransactionType txnType) {
        System.out.println("SAVING / CURRENT ");
    }

    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount) {
        System.out.println("Enter withdrawal amount");
    }

    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your bank account have X");
    }

    public void returnCard() {
        System.out.println("ThankYou for buying us");
    }

    public void exit(ATM atm) {
        System.out.println("Thank You for using us");
    }
}
