package AdapterPatternExample;


public class Main {
    public static void main(String[] args) {

        PaypalPayment paypalGateway = new PaypalPayment();
        StripePayment stripeGateway = new StripePayment();


        PaymentProcessor paypalProcessor = new PaypalAdapter(paypalGateway, "alice@example.com");
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway, 42);


        System.out.println("=== Charging via PayPal ===");
        paypalProcessor.processPayment(120.50);

        System.out.println("=== Charging via Stripe ===");
        stripeProcessor.processPayment(75.00);
    }
}
