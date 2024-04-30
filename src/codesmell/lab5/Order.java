package codesmell.lab5;

import java.util.List;

public class Order {
    private String customerName;
    private List<String> items;
    private double totalPrice;

    public Order(String customerName, List<String> items, double discountedPrice) {
        this.customerName = customerName;
        this.items = items;
        this.totalPrice = calculateTotalPrice();
    }

    private double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (String item : items) {
            double itemPrice = getPriceForItem(item);
            totalPrice += itemPrice;
        }
        return totalPrice;
    }

    private double getPriceForItem(String item) {
        if (item.equals("productA")) {
            return 10.0;
        } else if (item.equals("productB")) {
            return 20.0;
        } else {
            return 0.0;
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}