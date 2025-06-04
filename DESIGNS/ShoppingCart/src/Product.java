package DESIGNS.ShoppingCart.src;

public class Product {
    private final String id;
    private final String name;
    private final double price;
    private final ProductCategory category;

    public Product(String id, String name, double price, ProductCategory category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public ProductCategory getCategory() { return category; }
}