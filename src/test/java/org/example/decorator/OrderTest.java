package org.example.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {
    @Test
    void addItemIncludesFoodInOrder() {
        Order order = new Order();
        order.addItem(new Burger());
        assertEquals(5.0, order.getSubtotal(), 0.0001);
        order.addItem(new Fries());
        assertEquals(7.0, order.getSubtotal(), 0.0001);
    }

    @Test
    void getSubtotalSumsFoodsAndTheirToppings() {
        Order order = new Order();
        order.addItem(new Cheese(new Burger()));
        order.addItem(new Ketchup(new Fries()));
        assertEquals(8.0, order.getSubtotal(), 0.0001);
    }

    @Test
    void getSubtotalIsZeroForEmptyOrder() {
        assertEquals(0.0, new Order().getSubtotal(), 0.0001);
    }

    @Test
    void getTotalAppliesDiscountToEntireDecoratedOrder() {
        Order order = new Order();
        order.addItem(new Onions(new Cheese(new Burger())));
        order.addItem(new Ketchup(new Fries()));
        order.addItem(new Cheese(new HotDog()));
        LoyaltyStatus gold = new LoyaltyStatus(LoyaltyStatus.Level.GOLD);
        assertEquals(10.4125, order.getTotal(gold), 0.0001);
    }

    @Test
    void getTotalKeepsRegularCustomerSubtotal() {
        Order order = new Order();
        order.addItem(new Burger());
        LoyaltyStatus regular = new LoyaltyStatus(LoyaltyStatus.Level.REGULAR);
        assertEquals(5.0, order.getTotal(regular), 0.0001);
    }
}
