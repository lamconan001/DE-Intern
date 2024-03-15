package Order;
import Customer.*;
public class OrderProcessor {
    public double processOrder(Order order, Customer customer) {
        return customer.calculateTotalCost(order);
        // Xử lý đơn hàng với tổng chi phí đã tính
    }
}
