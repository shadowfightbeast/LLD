import models.*;
import services.*;

public class Main {
    public static void main(String[] args) {
        // Create Users
        User alice = new User("U001", "Alice", "alice@example.com");
        User bob = new User("U002", "Bob", "bob@example.com");

        // Create WalletService and BankService
        WalletService walletService = new WalletService();
        BankService bankService = new BankService();

        // Bank Account for Alice
        BankAccount aliceBank = new BankAccount("B001", "Bank of America", "123456789", 10000);
        bankService.linkBankAccount(alice.getUserId(), aliceBank);

        // Alice deposits money into her wallet
        walletService.deposit(alice, 2000);

        // Alice transfers money to Bob
        walletService.transfer(alice, bob, 500);

        // Bob checks his wallet balance
        System.out.println(bob.getName() + "'s Wallet Balance: " + bob.getWallet().getBalance());
    }
}
