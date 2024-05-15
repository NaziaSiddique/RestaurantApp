package org.Restaurant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    Manager manager;
    Menu menu;

    @Before
    public void initManager() {
        this.manager = new Manager("Bob");
        this.menu = new Menu("LondonBridge", "Food & Delight");
    }

    @Test
    public void addMealToMenu() {
        Meal meal5 = new Meal("meal5", "Chicken Filet Burger", 5.99);
        manager.addMealToMenu(meal5, this.menu);
        assert(menu.doesMealExist(meal5));
    }
}