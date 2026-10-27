package org.example.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OnlinePaymentNotificationTest {
    @Test
    void getMessageDescribesCreditCardPayment() {
        PaymentNotification payment = new OnlinePaymentNotification(
            new EmailChannel(), "customer@example.com", 50.0, "credit card");
        assertEquals("Online payment of $50.00 received via credit card.", payment.getMessage());
    }

    @Test
    void getMessageDescribesPayPalPayment() {
        PaymentNotification payment = new OnlinePaymentNotification(
            new SmsChannel(), "555-0100", 35.5, "PayPal");
        assertEquals("Online payment of $35.50 received via PayPal.", payment.getMessage());
    }
}
