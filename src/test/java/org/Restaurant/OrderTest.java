package org.Restaurant;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class OrderTest {

    Order order;
    @Before
    public void initOrder(){
        ArrayList<Meal> meals = new ArrayList<>();
//        Meal meal1 = new Meal("Chicken Tikka Baguette", "Fresh Chicken with Special Sauce", 9.99);
//        Meal meal3 = new Meal("Apna Style Pizza", "Special sauce for base and fresh chicken and mince", 15.99);
//        meals.add(meal1);
//        meals.add(meal3);

        Meal meal1 = mock(Meal.class);
        when(meal1.getPrice()).thenReturn(9.99);

        Meal meal2 = mock(Meal.class);
        when(meal2.getPrice()).thenReturn(15.99);

        meals.add(meal1);
        meals.add(meal2);
        order = new Order(meals);
    }


    @Test
    public void calculateTotalPrice() {
        assertEquals(25.98, order.getPrice(), 0);
    }
}