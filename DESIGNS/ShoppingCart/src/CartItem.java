package DESIGNS.ShoppingCart.src;

public class CartItem {
    private final Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItemTotal() {
        double baseTotal = product.getPrice() * quantity;
        if (product.getCategory() == ProductCategory.ELECTRONICS) {
            return baseTotal * 0.95; // 5% off electronics
        }
        return baseTotal;
    }
}