package S.goodcase;

import static java.util.UUID.randomUUID;

public class Invoice {

    private Order order;

    public Invoice(Order order) {
        this.order = order;
    }

    public String generateInvoice() {
        var tax = 0.5;
        if (order.getTotalOrderPrice() < 100) {
            tax += 10;
        } else {
            tax += 20;
        }

        return tax + randomUUID().toString();
    }

}
