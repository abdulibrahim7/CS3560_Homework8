package org.example.decorator;

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
