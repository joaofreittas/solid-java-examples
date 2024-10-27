package O.goodcase.strategies;

import O.goodcase.CalculatePaymentUseCase;

public class CashCalculatePayment implements CalculatePaymentUseCase {

    @Override
    public double execute(final double price) {
        return price;
    }

}
