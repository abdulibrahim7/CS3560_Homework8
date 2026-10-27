package org.example.bridge;

import org.example.support.OutputCapture;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SmsChannelTest {
    @Test
    void sendIncludesRecipientAndMessage() {
        String output = OutputCapture.capture(() ->
            new SmsChannel().send("customer", "Payment received"));
        assertEquals("[SMS to customer] Payment received\n", output);
    }
}
