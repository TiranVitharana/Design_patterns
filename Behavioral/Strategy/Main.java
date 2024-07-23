public class Main {
    public static void main (String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new PayPalPayment());
        paymentContext.processPayment(100);

        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.processPayment(120);

        paymentContext.setPaymentStrategy(new GooglePayPayment());
        paymentContext.processPayment(145);

    }
}
