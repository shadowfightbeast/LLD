package services;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import models.Order;
import models.Product;
import models.User;

public class OnlineShoppingService {
    private static OnlineShoppingService instance;
    private final Map<String, User> users;
    private final Map<String, Product> products;
    private final Map<String, Order> orders;

    private OnlineShoppingService() {
        users = new ConcurrentHashMap<>();
        products = new ConcurrentHashMap<>();
        orders = new ConcurrentHashMap<>();
    }

    public static synchronized OnlineShoppingService getInstnace() {
        if (instance == null) {
            instance = new OnlineShoppingService();
        }
    }

    public void registerUser(User user) {
        users.put(user.getId(), user);
    }

    public User getUser(String userId) {
        return users.get(userId);
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }
}
