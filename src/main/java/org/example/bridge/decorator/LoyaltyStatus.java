package org.example.decorator;

public class LoyaltyStatus {
    public enum Level {
        REGULAR, SILVER, GOLD
    }

    private final Level level;

    public LoyaltyStatus(Level level) {
        this.level = level;
    }

    public double applyDiscount(double total) {
        double discountRate = switch (level) {
            case REGULAR -> 0.0;
            case SILVER -> 0.10;
            case GOLD -> 0.15;
        };
        return total * (1.0 - discountRate);
    }
}
