package Customer.Discount;

public class FixedAmountDiscount implements DiscountStrategy {
    private double fixedDiscount;

    public FixedAmountDiscount(double fixedDiscount) {
        this.fixedDiscount = fixedDiscount;
    }

    @Override
    public double calculateCost(double totalCost) {
        if (totalCost - fixedDiscount > 0) {
            return totalCost - fixedDiscount;
        }
        return 0;
    }
}
