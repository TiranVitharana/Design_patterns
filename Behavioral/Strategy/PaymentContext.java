class PaymentContext {

    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentMethod) {
        this.paymentStrategy = paymentMethod;
    }

    public void processPayment(int amount) {
        paymentStrategy.pay(amount);
    }
}
