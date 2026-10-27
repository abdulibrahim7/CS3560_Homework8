package org.example.bridge;

import org.example.support.OutputCapture;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PushChannelTest {
    @Test
    void sendIncludesRecipientAndMessage() {
        String output = OutputCapture.capture(() ->
            new PushChannel().send("customer", "Payment received"));
        assertEquals("[Push to customer] Payment received\n", output);
    }
}
