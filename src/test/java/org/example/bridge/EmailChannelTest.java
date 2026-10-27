package org.example.bridge;

import org.example.support.OutputCapture;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmailChannelTest {
    @Test
    void sendIncludesRecipientAndMessage() {
        String output = OutputCapture.capture(() ->
            new EmailChannel().send("customer", "Payment received"));
        assertEquals("[Email to customer] Payment received\n", output);
    }
}
