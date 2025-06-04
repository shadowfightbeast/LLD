package DESIGNS.ShoppingCart.src;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private final Map<String, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public Product getProductById(String id) {
        return products.get(id);
    }

    public Collection<Product> getAllProducts() {
        return products.values();
    }

}
