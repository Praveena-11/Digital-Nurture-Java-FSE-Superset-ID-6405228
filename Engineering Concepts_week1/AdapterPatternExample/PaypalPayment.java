package AdapterPatternExample;

public class PaypalPayment {
    public void sendPayment(String email, double amount) {
        System.out.printf("Processed PayPal payment of $%.2f for %s%n", amount, email);
    }
}