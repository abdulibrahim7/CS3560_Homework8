package org.example.decorator;

public class HotDog implements FoodItem {
    @Override
    public String getDescription() {
        return "Hot dog";
    }

    @Override
    public double getCost() {
        return 3.0;
    }
}
