package AdapterPatternExample;

public class StripePayment {
    public void makePayment(int customerId, int cents) {
        System.out.printf("Processed Stripe payment of $%.2f for customer %d%n",
                cents / 100.0, customerId);
    }
}