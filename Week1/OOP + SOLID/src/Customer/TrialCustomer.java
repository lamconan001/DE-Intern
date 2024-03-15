package Customer;
import Customer.Discount.DiscountStrategy;
import Customer.PremiumCustomer;
import Order.Order;
public class TrialCustomer extends PremiumCustomer {
    private long trialExpirationTime;

    public TrialCustomer(String name, DiscountStrategy discountStrategy, long trialDurationInDays) {
        super(name, discountStrategy);
        this.trialExpirationTime = System.currentTimeMillis() + trialDurationInDays * 24 * 60 * 60 * 1000;
    }

    @Override
    public double calculateTotalCost(Order order) {
        if (System.currentTimeMillis() > trialExpirationTime) {
            // Thời gian dùng thử đã hết hạn, không được giảm giá
            return order.getTotalCost();
        } else {
            // Thời gian dùng thử vẫn còn, áp dụng giảm giá
            return super.calculateTotalCost(order);
        }
    }
}