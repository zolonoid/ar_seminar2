package Singleton;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<String> allProducts = new ArrayList<>();

    public void addToCart(int index) {
        ProductCart cart = ProductCart.getCart();
        cart.addProduct(allProducts.get(index));
    }

    public void delFromCart(int index) {
        ProductCart cart = ProductCart.getCart();
        cart.delProduct(allProducts.get(index));
    }
}
