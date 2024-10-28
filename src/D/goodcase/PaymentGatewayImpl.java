package D.goodcase;

public class PaymentGatewayImpl implements PaymentGateway {

    @Override
    public void processPayment(final String paymentType) {
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
