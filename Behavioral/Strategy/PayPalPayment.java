public class PayPalPayment implements PaymentStrategy{
    public void pay (int amount) {
        System.out.println(amount + " Rupees Payment by PayPal.. Please wait...");
    } 
}
