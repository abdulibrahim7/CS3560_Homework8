package org.example.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BitcoinPaymentTest {
    @Test
    void getMessageDescribesPayment() {
        PaymentNotification payment = new BitcoinPayment(
            new EmailChannel(), "customer@example.com", 40.0);
        assertEquals("Bitcoin payment of $40.00 received.", payment.getMessage());
    }
}
