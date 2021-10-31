package payments;

import org.junit.jupiter.api.Test;

class CreditCardPaymentStrategyTest {

    CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();

    @Test
    void makePayment() {
        creditCardPaymentStrategy.makePayment(20.0);
    }
}