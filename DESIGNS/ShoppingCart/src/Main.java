package DESIGNS.ShoppingCart.src;

public class Main {
    public static void main(String args[]) {
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(new Product("P100", "iPhone 15", 1200, ProductCategory.ELECTRONICS));
        catalog.addProduct(new Product("P200", "T-Shirt", 30, ProductCategory.FASHION));
        catalog.addProduct(new Product("P300", "Lipstick", 20, ProductCategory.BEAUTY));
        catalog.addProduct(new Product("P400", "Laptop", 1500, ProductCategory.ELECTRONICS));
        catalog.addProduct(new Product("P500", "Notebook", 10, ProductCategory.BOOKS));

        // Create user
        User user = new User("U001", "Alice");
        // Add to cart
        user.getCart().addProduct(catalog.getProductById("P100"), 1); // iPhone
        user.getCart().addProduct(catalog.getProductById("P400"), 1); // Laptop
        user.getCart().addProduct(catalog.getProductById("P200"), 3); // T-Shirt x3
        // Remove a product
        user.getCart().removeProduct("P200");
        System.out.println("\nAfter removing T-Shirts:");
        user.getCart().printCart();
    }
}
