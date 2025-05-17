package DESIGNS.Ecommerce2;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

//1. Add product to cart with inventory count.
//2. Get inventory cnt.
//3. Place Order for product id and given cnt, (edge cases if under stock).
//4. Place order and confirm it by calculating total amount, 
//Bonus 1.How multiple people can order at same time (synchronous asynchronous logic),
//  2. Revert back add to cart items to stock if order not placed within 5 min
class Product {
    private final int id;
    private final String name;
    private int inventory;
    private final double price;

    public Product(int id, String name, int inventory, double price) {
        this.id = id;
        this.name = name;
        this.inventory = inventory;
        this.price = price;
    }

    public synchronized boolean updateInventory(int count) {
        if (inventory >= count) {
            inventory -= count;
            return true;
        }
        return false;
    }

    public synchronized void revertInventory(int count) {
        inventory += count;
    }

    public int getInventory() {
        return inventory;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class CartItem {
    private final Product product;
    private final int count;

    public CartItem(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }

    public double getTotalPrice() {
        return product.getPrice() * count;
    }
}

class Cart {
    private final List<CartItem> items = new ArrayList<>();

    public synchronized void addItem(Product product, int count) {
        items.add(new CartItem(product, count));
        product.updateInventory(count); // Reserve inventory
    }

    public synchronized List<CartItem> getItems() {
        return new ArrayList<>(items);
    }

    public synchronized double calculateTotal() {
        return items.stream().mapToDouble(CartItem::getTotalPrice).sum(); //
    }

    public synchronized void revertItems() {
        for (CartItem item : items) {
            item.getProduct().revertInventory(item.getCount());
        }
        items.clear();
    }
}

class OrderSystem {
    private final Map<Integer, Product> inventory = new ConcurrentHashMap<>();
    private final Lock lock = new ReentrantLock();

    public void addProduct(Product product) {
        inventory.put(product.getId(), product);
    }

    public int getInventoryCount(int productId) {
        Product product = inventory.get(productId);
        return product != null ? product.getInventory() : 0;
    }

    public void placeOrder(Cart cart) {
        double totalAmount = cart.calculateTotal();
        System.out.println("Order placed. Total amount: " + totalAmount);
        cart.getItems().clear();
    }

    public Cart createCart() {
        return new Cart();
    }
}

class CartReversionScheduler {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public void scheduleReversion(Cart cart, long delay, TimeUnit unit) {
        scheduler.schedule(cart::revertItems, delay, unit);
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) throws InterruptedException {
        OrderSystem orderSystem = new OrderSystem();
        CartReversionScheduler scheduler = new CartReversionScheduler();

        Product product1 = new Product(1, "Laptop", 10, 999.99);
        Product product2 = new Product(2, "Mouse", 50, 19.99);

        orderSystem.addProduct(product1);
        orderSystem.addProduct(product2);

        System.out.println("Inventory Laptop: " + orderSystem.getInventoryCount(1));
        System.out.println("Inventory Mouse: " + orderSystem.getInventoryCount(2));

        Cart cart1 = orderSystem.createCart();
        cart1.addItem(product1, 2);

        scheduler.scheduleReversion(cart1, 5, TimeUnit.MINUTES);

        System.out.println("Inventory Laptop after adding to cart: " + orderSystem.getInventoryCount(1));

        Thread.sleep(2000); // Simulate delay

        orderSystem.placeOrder(cart1);
        System.out.println("Inventory Laptop after order: " + orderSystem.getInventoryCount(1));
    }
}
