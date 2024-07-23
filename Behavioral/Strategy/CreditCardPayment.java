class CreditCardPayment implements PaymentStrategy{
    public void pay (int amount) {
        System.out.println(amount + " Rupees Payment by credit card.. Please wait...");
    } 
}
