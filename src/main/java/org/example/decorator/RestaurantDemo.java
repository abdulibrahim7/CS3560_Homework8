package org.example.bridge.decorator;

import java.util.Locale;

public class RestaurantDemo {
    public static void main(String[] args) {
        FoodItem[] foods = {
            new Onions(new Cheese(new Burger())),
            new Ketchup(new Fries()),
            new Cheese(new HotDog())
        };
        Order order = new Order();
        for (FoodItem food : foods) {
            order.addItem(food);
            System.out.printf(Locale.US, "%s: $%.2f%n", food.getDescription(), food.getCost());
        }

        LoyaltyStatus gold = new LoyaltyStatus(LoyaltyStatus.Level.GOLD);
        System.out.printf(Locale.US, "Subtotal: $%.2f%n", order.getSubtotal());
        System.out.printf(Locale.US, "Gold total (15%% off): $%.2f%n", order.getTotal(gold));
    }
}
