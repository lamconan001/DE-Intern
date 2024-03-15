package Order;
import Products.*;
import java.util.*;
public class Order {
    private int orderId;
    private String customerName;
    private List<Product> products;
    private double totalCost;
    public Order() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
        totalCost += product.getPrice();
    }

    public void removeProduct(Product product) {
        products.remove(product);
        totalCost -= product.getPrice();
    }

    public double getTotalCost() {
        return totalCost;
    }
}