package org.Restaurant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {
    private Menu menu;
  @Before
    public void initMenu() {
      this.menu = new Menu("Harvard Spice", "Edible in Education");
  }

  @Test
    public void numberOfIngredientsInMealOne() {
      int ingredientNum = Menu.getMeals().get(0).getIngredients().size();
      assertEquals(4, ingredientNum);
  }

}