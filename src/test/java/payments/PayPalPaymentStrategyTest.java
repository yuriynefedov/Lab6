package payments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    PayPalPaymentStrategy paymentStrategy = new PayPalPaymentStrategy();

    @Test
    void makePayment() {
        paymentStrategy.makePayment(30.0);
    }

}