package DESIGNS.SplitWise.src;

import java.util.List;

public class Expense {
    private User paidBy;
    private List<User> paidFor;
    private int amount;

    public Expense(User paidBy, List<User> paidFor, int amount) {
        this.paidBy = paidBy;
        this.paidFor = paidFor;
        this.amount = amount;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public List<User> getPaidFor() {
        return paidFor;
    }

    public int getAmount() {
        return amount;
    }
}
