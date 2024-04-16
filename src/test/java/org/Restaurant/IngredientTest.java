package org.Restaurant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientTest {

    private Ingredient ingredient;

    @Before
    public void initIngredient() {
        this.ingredient = new Ingredient("Chillies", 5);
    }

    @Test
    public void getName() {
        assertNotEquals("Ice",5);
    }

    @Test
    public void setName() {
        ingredient.setName("Milky Cheese");
        assertEquals("Milky Cheese", ingredient.getName());
    }

    @Test
    public void getQuantity() {
        assertEquals(5, ingredient.getQuantity());
    }

    @Test
    public void setQuantity() {
        ingredient.setQuantity(12);
        assertEquals(12, ingredient.getQuantity());
    }
}