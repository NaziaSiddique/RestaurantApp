package org.Restaurant;

public class Manager {

    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                '}';
    }

    public void addMealToMenu(Meal meal, Menu menu) {

        menu.addMeal(meal);
    }
}
// Create a method called removeMealFromMenu, Create a method called addWaiters, Create a method called addChef, assignCooksToChef
// Create test cases for all the above