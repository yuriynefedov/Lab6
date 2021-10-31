package payments;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " was completed by card.");
    }
}
