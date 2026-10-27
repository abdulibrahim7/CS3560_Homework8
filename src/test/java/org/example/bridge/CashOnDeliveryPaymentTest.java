package org.example.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CashOnDeliveryPaymentTest {
    @Test
    void getMessageDescribesPayment() {
        PaymentNotification payment = new CashOnDeliveryPayment(
            new EmailChannel(), "customer@example.com", 40.0);
        assertEquals("Cash on delivery: $40.00 is due when your order arrives.", payment.getMessage());
    }
}
