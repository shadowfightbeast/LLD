import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create users
        User A = new User("A");
        User B = new User("B");
        User C = new User("C");

        // Initialize manager
        SplitwiseManager manager = new SplitwiseManager();

        // Add expenses
        // A paid ₹300 for A, B, C (split 3 ways)
        manager.addExpense(new Expense(A, Arrays.asList(A, B, C), 300));

        // B paid ₹200 for A and B
        manager.addExpense(new Expense(B, Arrays.asList(A, B), 200));

        // C paid ₹150 for A and C
        manager.addExpense(new Expense(C, Arrays.asList(A, C), 150));

        // Show result
        System.out.println("Settlement:");
        manager.minimizeCashFlow();
    }
}
