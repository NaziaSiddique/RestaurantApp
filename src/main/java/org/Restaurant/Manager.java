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

    public void removeMealFromMenu(Meal meal, Menu menu) {

        menu.removeMeal(meal);
    }
    public void addWaitersToStaff(Waiter waiter, Staff staff) {

        staff.addWaiters(waiter);
    }

    public void addChefToStaff(Chef chef, Staff staff) {

        staff.setChef(chef);
    }

    public void assignCookToChef(Cook cook, Chef chef) {

        chef.addCook(cook);
    }

}
//  assignCooksToChef
// Create test cases for all the above