package AdapterPatternExample;

public class StripeAdapter implements PaymentProcessor {
    private final StripePayment stripe;
    private final int customerId;

    public StripeAdapter(StripePayment stripe, int customerId) {
        this.stripe = stripe;
        this.customerId = customerId;
    }

    @Override
    public void processPayment(double amount) {
        // Stripe expects cents and a customer ID
        int cents = (int) Math.round(amount * 100);
        stripe.makePayment(customerId, cents);
    }
}