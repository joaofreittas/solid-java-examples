package S.badcase;

import java.util.List;

import static java.util.UUID.randomUUID;

public class Order {

    private final String id;
    private List<Object> products;

    public Order(final String id, final List<Object> products) {
        this.id = id;
        this.products = products;
    }

    public void addProduct(final Object product) {
        products.add(product);
    }

    private int getTotalOrderPrice() {
        return 0;
    }

    public String generateInvoice() {
        var tax = 0.5;
        if (getTotalOrderPrice() < 100) {
            tax += 10;
        } else {
            tax += 20;
        }

        return tax + randomUUID().toString();
    }

}
