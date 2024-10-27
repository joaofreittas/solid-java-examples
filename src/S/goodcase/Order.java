package S.goodcase;

import java.util.List;

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

    public int getTotalOrderPrice() {
        return 0;
    }

}
