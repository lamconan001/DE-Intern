package Customer;
import Order.*;
abstract public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    abstract public double calculateTotalCost(Order order);
}
