package org.example.bridge.decorator;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double getSubtotal() {
        double total = 0.0;
        for (FoodItem item : items) {
            total += item.getCost();
        }
        return total;
    }

    public double getTotal(LoyaltyStatus loyaltyStatus) {
        return loyaltyStatus.applyDiscount(getSubtotal());
    }
}
