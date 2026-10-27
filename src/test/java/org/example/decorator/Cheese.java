package org.example.decorator;

public class Cheese extends FoodDecorator {
    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }
}
