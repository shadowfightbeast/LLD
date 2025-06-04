package DESIGNS.ShoppingCart.src;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private final Map<String, CartItem> items = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        items.compute(product.getId(), (id, existing) -> {
            if (existing == null) {
                return new CartItem(product, quantity);
            }
            existing.setQuantity(existing.getQuantity() + quantity);
            return existing;
        });
    }

    public void removeProduct(String productId) {
        items.remove(productId);
    }

    public double getTotalPrice() {
        double total = items.values().stream().mapToDouble(CartItem::getItemTotal).sum();
        if (total > 500) {
            total *= 0.90; // 10% off
        }
        return total;
    }

    public void printCart() {
        System.out.println("------ Cart ------");
        for (CartItem item : items.values()) {
            System.out.printf("%s x%d - $%.2f\n",
                    item.getProduct().getName(),
                    item.getQuantity(),
                    item.getItemTotal());
        }
        System.out.printf("Total: $%.2f\n", getTotalPrice());
    }

}
