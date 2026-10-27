package org.example.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PaymentNotificationTest {
    @Test
    void sendNotificationDelegatesRecipientAndMessageToChannel() {
        String[] delivered = new String[2];
        NotificationChannel recordingChannel = (recipient, message) -> {
            delivered[0] = recipient;
            delivered[1] = message;
        };
        PaymentNotification notification = new OnlinePaymentNotification(
            recordingChannel, "customer@example.com", 50.0, "credit card");

        notification.sendNotification();

        assertEquals("customer@example.com", delivered[0]);
        assertEquals("Online payment of $50.00 received via credit card.", delivered[1]);
    }
}
