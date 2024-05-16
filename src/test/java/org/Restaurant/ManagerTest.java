package org.Restaurant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    Manager manager;
    Menu menu;
    Staff staff;

    @Before
    public void initManager() {
        this.manager = new Manager("Bob");
        this.menu = new Menu("LondonBridge", "Food & Delight");
        this.staff = new Staff(new Chef());
    }

    @Test
    public void addMealToMenu() {
        Meal meal5 = new Meal("meal5", "Chicken Filet Burger", 5.99);
        manager.addMealToMenu(meal5, this.menu);
        assert(menu.doesMealExist(meal5));
    }

    @Test
    public void removeMealFromMenu() {
        Meal meal6 = new Meal("meal6", "Fatayer", 5.00);
        manager.addMealToMenu(meal6, this.menu);
        manager.removeMealFromMenu(meal6, this.menu);
        assert(!menu.doesMealExist(meal6));
    }

    @Test
    public void addWaitersToStaff() {
        Waiter waiter1 = new Waiter();
        manager.addWaitersToStaff(waiter1, staff);
        assert(staff.doesWaiterExist(waiter1));
    }
    @Test
    public void addChefToStaff() {
        Chef chef1 = new Chef();
        manager.addChefToStaff(chef1, staff);
        assertEquals(chef1, staff.getChef());
    }
}