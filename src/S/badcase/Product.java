package S.badcase;

public class Product {

    private final String code;
    private String name;
    private double price;

    public Product(final String code, final String name, final double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(final double discountPercent) {
        this.price -= price * (discountPercent / 100);
    }

    public void changePrice(final double newPrice) {
        this.price = newPrice;
    }

    public void changeName(final String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
