package org.example.bridge.decorator;

import org.example.decorator.FoodDecorator;

public class Onions extends FoodDecorator {
    public Onions(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Onions";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
