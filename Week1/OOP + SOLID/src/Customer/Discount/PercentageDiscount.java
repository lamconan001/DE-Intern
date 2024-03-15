package Customer.Discount;
import Customer.Customer;

public class PercentageDiscount implements DiscountStrategy {
    private double discountRate;

    public PercentageDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    @Override
    public double calculateCost(double totalCost) {
        return (1-discountRate)*totalCost;
    }

}
