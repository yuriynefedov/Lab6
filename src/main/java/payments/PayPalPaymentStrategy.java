package payments;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " was completed by card.");
    }
}
