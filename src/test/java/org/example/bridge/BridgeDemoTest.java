package org.example.bridge;

import org.example.support.OutputCapture;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BridgeDemoTest {
    @Test
    void mainPrintsEveryRequiredScenario() {
        String output = OutputCapture.capture(() -> BridgeDemo.main(new String[0]));
        String expected = String.join("\n",
            "[Email to customer@example.com] Online payment of $50.00 received via credit card.",
            "[SMS to 555-0100] Online payment of $35.50 received via PayPal.",
            "[Email to customer@example.com] Cash on delivery: $40.00 is due when your order arrives.",
            "[SMS to 555-0100] Cash on delivery: $40.00 is due when your order arrives.",
            "[Email to customer@example.com] Bitcoin payment of $75.00 received.",
            "[SMS to 555-0100] Bitcoin payment of $75.00 received.",
            "[Push to customer-device] Online payment of $20.00 received via credit card.",
            "[Push to customer-device] Cash on delivery: $25.00 is due when your order arrives."
        ) + "\n";
        assertEquals(expected, output);
    }
}
