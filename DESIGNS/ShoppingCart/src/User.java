package DESIGNS.ShoppingCart.src;

public class User {
    private final String userId;
    private final String name;
    private final ShoppingCart cart;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.cart = new ShoppingCart();
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
