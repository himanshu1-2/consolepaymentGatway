public class UPI implements PaymentStrategy{
    public UPI(String upiId) {
        this.upiId = upiId;
    }

    String upiId;
    @Override
    public void processPayment(double amount) {
        System.out.println("amount"+amount+"processed of upi "+upiId);
    }
}
