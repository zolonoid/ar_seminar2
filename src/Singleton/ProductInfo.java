package Singleton;

public class ProductInfo {
    private final String productName;

    public ProductInfo(String productName) {
        this.productName = productName;
    }

    public void addToCart() {
        ProductCart cart = ProductCart.getCart();
        cart.addProduct(productName);
    }

    public void delFromCart(int index) {
        ProductCart cart = ProductCart.getCart();
        cart.delProduct(productName);
    }
}
