package org.example.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LoyaltyStatusTest {
    @Test
    void applyDiscountLeavesRegularTotalUnchanged() {
        LoyaltyStatus status = new LoyaltyStatus(LoyaltyStatus.Level.REGULAR);
        assertEquals(100.0, status.applyDiscount(100.0), 0.0001);
    }

    @Test
    void applyDiscountTakesTenPercentOffForSilver() {
        LoyaltyStatus status = new LoyaltyStatus(LoyaltyStatus.Level.SILVER);
        assertEquals(90.0, status.applyDiscount(100.0), 0.0001);
    }

    @Test
    void applyDiscountTakesFifteenPercentOffForGold() {
        LoyaltyStatus status = new LoyaltyStatus(LoyaltyStatus.Level.GOLD);
        assertEquals(85.0, status.applyDiscount(100.0), 0.0001);
    }
}
