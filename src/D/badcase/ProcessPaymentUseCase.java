package D.badcase;

public class ProcessPaymentUseCase {

    private final PaymentGateway paymentGateway;

    public ProcessPaymentUseCase(final PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processPayment(String paymentType) {
        paymentGateway.processPayment(paymentType);
    }

}
