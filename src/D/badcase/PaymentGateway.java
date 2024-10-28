package D.badcase;

public class PaymentGateway {

    public void processPayment(String paymentType) {
        if (paymentType.equals("creditCard")) {
            // process credit card payment
        } else if (paymentType.equals("netBanking")) {
            // process net banking payment
        } else if (paymentType.equals("wallet")) {
            // process wallet payment
        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }

}
