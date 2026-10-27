package org.example.bridge.decorator;

import org.example.decorator.FoodDecorator;
import org.example.decorator.FoodItem;

public class Ketchup extends FoodDecorator {
    public Ketchup(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Ketchup";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.25;
    }
}
