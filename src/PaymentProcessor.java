public class PaymentProcessor {
    PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void executePayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}
