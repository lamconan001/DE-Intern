package Products;

public class Electronic extends Product {
    private String brand;
    private String model;

    public Electronic(String name, double price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + super.getName() + " Price " + super.getPrice() + " Brand: " + brand + " Model: " + model);
    }
}
