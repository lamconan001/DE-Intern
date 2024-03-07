import Customer.*;
import Customer.Discount.*;
import Order.*;
import Products.*;

class Application {
    public static void main(String[] args) {
        // Tạo các đối tượng sản phẩm
        Product book = new Book("Tên sách", 20.0, "Tác giả", "Thể loại");
        Product electronic = new Electronic("Tên thiết bị", 500.0, "Thương hiệu", "Model");


        // Tạo đơn hàng
        Order order = new Order();
        order.addProduct(book);
        order.addProduct(electronic);

        // Tạo các loại khách hàng khác nhau
        DiscountStrategy percentageDiscount = new PercentageDiscount(0.1); // Giảm giá 10%
        PremiumCustomer premiumCustomer = new PremiumCustomer("John Doe", percentageDiscount);

        DiscountStrategy fixedDiscount = new FixedAmountDiscount(5.0); // Giảm giá cố định $5
        PremiumCustomer anotherPremiumCustomer = new PremiumCustomer("Jane Smith", fixedDiscount);

        TrialCustomer trialCustomer = new TrialCustomer("Bob Johnson", percentageDiscount, 7); // Dùng thử trong 7 ngày với giảm giá 10%

        Customer regularCustomer = new NormalCustomer("Alice Williams");

        // Xử lý đơn hàng cho các loại khách hàng khác nhau
        OrderProcessor processor = new OrderProcessor();
        System.out.println(processor.processOrder(order, premiumCustomer));
        System.out.println(processor.processOrder(order, anotherPremiumCustomer));
        System.out.println(processor.processOrder(order, trialCustomer));
        System.out.println(processor.processOrder(order, regularCustomer));
    }
}