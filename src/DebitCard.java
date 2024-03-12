public class DebitCard implements PaymentStrategy{
    String cardNumber;
    String cvv;
    String expiryDate;

    public DebitCard(String cardNumber, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("amount"+amount+"processed of card"+cardNumber);
    }
}
