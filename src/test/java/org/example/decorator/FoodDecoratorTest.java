package org.example.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FoodDecoratorTest {
    @Test
    void getDescriptionDelegatesToWrappedFood() {
        FoodItem wrapper = new FoodDecorator(new Burger()) { };
        assertEquals("Burger", wrapper.getDescription());
    }

    @Test
    void getCostDelegatesToWrappedFood() {
        FoodItem wrapper = new FoodDecorator(new Fries()) { };
        assertEquals(2.0, wrapper.getCost(), 0.0001);
    }
}
