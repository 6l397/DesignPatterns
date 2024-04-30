package codesmell.lab5;

import java.util.List;

public class OrderProcessor {
    private Order order;

    public OrderProcessor(Order order) {
        this.order = order;
    }

    public void processOrder() {
        validateOrder();
        applyDiscounts();
        generateInvoice();
        sendConfirmationEmail();
    }

    private void validateOrder() {
        List<String> items = order.getItems();
        if (items.isEmpty()) {
            throw new IllegalStateException("The order does not contain products.");
        }
    }

    private void applyDiscounts() {
        double totalPrice = order.getTotalPrice();
        double discountedPrice = totalPrice * 0.9;
        order = new Order(order.getCustomerName(), order.getItems(), discountedPrice);
    }

    private void generateInvoice() {
        System.out.println("Generation of an invoice for an order:");
        System.out.println("Clients: " + order.getCustomerName());
        System.out.println("Products:");
        for (String item : order.getItems()) {
            System.out.println("- " + item);
        }
        System.out.println("The total cost: " + order.getTotalPrice());
    }

    private void sendConfirmationEmail() {
        System.out.println("Sending a confirmation email to " + order.getCustomerName());
        System.out.println("Order confirmed. The total cost: " + order.getTotalPrice());
    }
}
