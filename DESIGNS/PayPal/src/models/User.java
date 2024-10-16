package models;
public class User {
    private String userId;
    private String name;
    private String email;
    private Wallet wallet;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.wallet = new Wallet(userId); // Each user has a wallet
    }

    // Getters and setters
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public Object getPassword() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPassword'");
    }
}
