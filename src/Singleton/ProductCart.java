package Singleton;

import java.util.HashSet;

public class ProductCart {
    private static ProductCart productCart = null;
    private final HashSet<String> products;

    private ProductCart() {
        products = new HashSet<>();
    }

    public void addProduct(String product) {
        if (products.contains(product)) {
            System.out.println("Товар уже находится в корзине.");
            return;
        }
        products.add(product);
    }

    public boolean delProduct(String product) {
        return products.remove(product);
    }

    public static ProductCart getCart() {
        if (productCart == null) {
            productCart = new ProductCart();
        }
        return productCart;
    }
}
