package DESIGNS.SplitWise.src;

import java.util.*;

public class SplitwiseManager {
    private Map<User, Integer> netBalance;

    public SplitwiseManager() {
        netBalance = new HashMap<>();
    }

    // Add an expense to the system and update balances
    public void addExpense(Expense expense) {
        int totalAmount = expense.getAmount();
        List<User> participants = expense.getSplitAmong();
        int share = totalAmount / participants.size(); // equal split

        for (User user : participants) {
            if (!user.equals(expense.getPaidBy())) {
                netBalance.put(user, netBalance.getOrDefault(user, 0) - share);
                netBalance.put(expense.getPaidBy(), netBalance.getOrDefault(expense.getPaidBy(), 0) + share);
            }
        }
    }

    // Print the minimized cash flow
    public void minimizeCashFlow() {
        // Debtors = those with negative balance
        PriorityQueue<Map.Entry<User, Integer>> debtors = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue));

        // Creditors = those with positive balance
        PriorityQueue<Map.Entry<User, Integer>> creditors = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        // Categorize users
        for (Map.Entry<User, Integer> entry : netBalance.entrySet()) {
            if (entry.getValue() < 0)
                debtors.offer(entry);
            else if (entry.getValue() > 0)
                creditors.offer(entry);
        }

        // Match debtors and creditors
        while (!debtors.isEmpty() && !creditors.isEmpty()) {
            var debtor = debtors.poll();
            var creditor = creditors.poll();

            int amountToSettle = Math.min(-debtor.getValue(), creditor.getValue());

            System.out.println(
                    debtor.getKey().getName() + " pays ₹" + amountToSettle + " to " + creditor.getKey().getName());

            int newDebtorBalance = debtor.getValue() + amountToSettle;
            int newCreditorBalance = creditor.getValue() - amountToSettle;

            if (newDebtorBalance != 0)
                debtors.offer(new AbstractMap.SimpleEntry<>(debtor.getKey(), newDebtorBalance));

            if (newCreditorBalance != 0)
                creditors.offer(new AbstractMap.SimpleEntry<>(creditor.getKey(), newCreditorBalance));
        }
    }
}
