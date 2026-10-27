package org.example.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicFoodTest {

        @Test
        void burgerDescriptionNamesTheFood() {
            assertEquals("Burger", new Burger().getDescription());
        }

        @Test
        void burgerCostMatchesBasePrice() {
            assertEquals(5.0, new Burger().getCost(), 0.0001);
        }


        @Test
        void friesDescriptionNamesTheFood() {
            assertEquals("Fries", new Fries().getDescription());
        }

        @Test
        void friesCostMatchesBasePrice() {
            assertEquals(2.0, new Fries().getCost(), 0.0001);
        }


        @Test
        void hotDogDescriptionNamesTheFood() {
            assertEquals("Hot dog", new HotDog().getDescription());
        }

        @Test
        void hotDogCostMatchesBasePrice() {
            assertEquals(3.0, new HotDog().getCost(), 0.0001);
        }
    }
