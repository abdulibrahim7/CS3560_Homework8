package org.example.decorator;

/** A topping IS a FoodItem and HAS a wrapped FoodItem. */
public abstract class FoodDecorator implements FoodItem {
    protected final FoodItem foodItem;

    protected FoodDecorator(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription();
    }

    @Override
    public double getCost() {
        return foodItem.getCost();
    }
}
