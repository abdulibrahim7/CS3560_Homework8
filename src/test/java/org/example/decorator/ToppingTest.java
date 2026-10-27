package org.example.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ToppingTest {

        @Test
        void ketchupDescriptionIncludesWrappedFoodAndTopping() {
            assertEquals("Burger, Ketchup", new Ketchup(new Burger()).getDescription());
        }

        @Test
        void ketchupCostAddsToppingPrice() {
            assertEquals(5.25, new Ketchup(new Burger()).getCost(), 0.0001);
        }


        @Test
        void cheeseDescriptionIncludesWrappedFoodAndTopping() {
            assertEquals("Burger, Cheese", new Cheese(new Burger()).getDescription());
        }

        @Test
        void cheeseCostAddsToppingPrice() {
            assertEquals(5.75, new Cheese(new Burger()).getCost(), 0.0001);
        }


        @Test
        void onionsDescriptionIncludesWrappedFoodAndTopping() {
            assertEquals("Burger, Onions", new Onions(new Burger()).getDescription());
        }

        @Test
        void onionsCostAddsToppingPrice() {
            assertEquals(5.5, new Onions(new Burger()).getCost(), 0.0001);
        }


        @Test
        void stackedDescriptionIncludesEveryTopping() {
            FoodItem food = new Onions(new Cheese(new Burger()));
            assertEquals("Burger, Cheese, Onions", food.getDescription());
        }

        @Test
        void stackedCostIncludesEveryTopping() {
            FoodItem food = new Onions(new Cheese(new Burger()));
            assertEquals(6.25, food.getCost(), 0.0001);
        }
}
