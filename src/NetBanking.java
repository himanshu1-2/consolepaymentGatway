public class NetBanking implements PaymentStrategy{
   String username;
   String password;

    public NetBanking(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("amount"+amount+"processed "+username);
    }
}
