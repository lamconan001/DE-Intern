package Customer;

import Customer.Customer;
import Customer.Discount.DiscountStrategy;
import Order.Order;

public class PremiumCustomer extends Customer {
    private DiscountStrategy discountStrategy;

    public PremiumCustomer(String name, DiscountStrategy discountStrategy) {
        super(name);
        this.discountStrategy = discountStrategy;
    }
    @Override
    public double calculateTotalCost(Order order) {
        double totalCost = order.getTotalCost();
        return discountStrategy.calculateCost(totalCost);
    }
}
