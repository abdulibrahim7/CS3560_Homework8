package org.example.bridge.decorator;

/** Common component interface for food items and topping decorators. */
public interface FoodItem {
    String getDescription();
    double getCost();
}
