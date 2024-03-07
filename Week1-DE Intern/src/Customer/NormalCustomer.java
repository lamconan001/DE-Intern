package Customer;

import Order.Order;

public class NormalCustomer extends Customer {
    public NormalCustomer(String name) {
        super(name);
    }

    @Override
    public double calculateTotalCost(Order order) {
        return order.getTotalCost();
    }
}
