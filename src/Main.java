import java.util.Scanner;


 class Client{
   Scanner scanner = new Scanner(System.in);
    public void runClient(){
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        System.out.println("Welcome to payment gateway");
       try {
           while (true) {
               menu();
               String option = scanner.next();
               System.out.println("Enter amount");
               String amount = scanner.next();
               selectOption(paymentProcessor,option, amount);
           }
       }catch (Exception e){
           System.out.println("Error"+e.getMessage());
       }

    }
     private static void menu() {
         System.out.println("Enter your Option");
         System.out.println("1.DebitCard");
         System.out.println("2.NetBanking");
         System.out.println("3.UPI");
         System.out.println("4.Exit");
     }

     private  void selectOption(PaymentProcessor paymentProcessor, String option, String amount) {
         double payment = Double.parseDouble(amount);
         switch (option) {
             case "1":
                 System.out.println("Enter card number");
                 String cardNumber= scanner.next();
                 System.out.println("Enter cvv");
                 String cvv= scanner.next();
                 System.out.println("Enter expiryDate");
                 String date= scanner.next();
                 paymentProcessor.setPaymentStrategy(new DebitCard(cardNumber,cvv,date));
                 break;
             case "2":
                 System.out.println("Enter user Name");
                 String name= scanner.next();
                 System.out.println("Enter password");
                 String password= scanner.next();
                 paymentProcessor.setPaymentStrategy(new NetBanking(name,password));
                 break;
             case "3":
                 System.out.println("Enter upi");
                 String upi= scanner.next();
                 paymentProcessor.setPaymentStrategy(new UPI(upi));
                 break;
             case "4":
                 System.exit(200);

         }
         paymentProcessor.executePayment(payment);
     }

}

public class Main {

    public static void main(String[] args) {
      Client client = new Client();
      client.runClient();
     }

    }

