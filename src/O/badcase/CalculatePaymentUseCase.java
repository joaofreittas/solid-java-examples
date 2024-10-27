package O.badcase;

public class CalculatePaymentUseCase {

    public double execute(final PaymentType paymentType, final double price) {
        var result = 0.0;
        if (PaymentType.CREDIT_CARD.equals(paymentType)) {
            result = price * 0.20;

        } else if (PaymentType.DEBIT_CARD.equals(paymentType)) {
            result = price * 0.50;

        } else if (PaymentType.CASH.equals(paymentType)) {
            result = price;

        } else {
            throw new IllegalArgumentException("Payment type not supported");
        }

        return result;
    }

}


enum PaymentType {
    CREDIT_CARD,
    CASH,
    DEBIT_CARD
}
