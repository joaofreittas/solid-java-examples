package S.badcase;

import java.util.List;

import static java.util.UUID.randomUUID;

public class Order {

    private final String id;
    private List<Product> products;

    public Order(final String id, final List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public void addProduct(final Product product) {
        products.add(product);
    }

    public double getTotal() {
        return products
            .stream()
            .mapToDouble(Product::getPrice)
            .sum();
    }

    public String generateInvoice() {
        var tax = 0.5;
        if (getTotal() < 100) {
            tax += 10;
        } else {
            tax += 20;
        }

        return tax + randomUUID().toString();
    }

}
