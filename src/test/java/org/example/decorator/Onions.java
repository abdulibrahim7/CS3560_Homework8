package org.example.decorator;

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
