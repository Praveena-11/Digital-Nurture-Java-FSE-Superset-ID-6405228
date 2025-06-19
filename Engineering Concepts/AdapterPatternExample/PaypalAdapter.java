package AdapterPatternExample;

    public class PaypalAdapter implements PaymentProcessor {
        private final PaypalPayment paypal;
        private final String accountEmail;

        public PaypalAdapter(PaypalPayment paypal, String accountEmail) {
            this.paypal = paypal;
            this.accountEmail = accountEmail;
        }

        @Override
        public void processPayment(double amount) {
            paypal.sendPayment(accountEmail, amount);
        }
    }

