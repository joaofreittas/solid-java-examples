package O.goodcase.strategies;

import O.goodcase.CalculatePaymentUseCase;

public class CreditCardCalculatePayment implements CalculatePaymentUseCase {

    @Override
    public double execute(final double price) {
        return price * 0.20;
    }

}
