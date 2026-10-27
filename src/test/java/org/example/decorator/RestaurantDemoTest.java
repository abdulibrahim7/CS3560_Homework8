package org.example.decorator;

import org.example.support.OutputCapture;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RestaurantDemoTest {
    @Test
    void mainPrintsItemsSubtotalAndDiscountedTotal() {
        String output = OutputCapture.capture(() -> RestaurantDemo.main(new String[0]));
        String expected = String.join("\n",
            "Burger, Cheese, Onions: $6.25",
            "Fries, Ketchup: $2.25",
            "Hot dog, Cheese: $3.75",
            "Subtotal: $12.25",
            "Gold total (15% off): $10.41"
        ) + "\n";
        assertEquals(expected, output);
    }
}
