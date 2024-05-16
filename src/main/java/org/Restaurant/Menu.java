package org.Restaurant;
import java.util.ArrayList;

public class Menu {
    private String name;
    private String description;
    static private ArrayList<Meal> meals;

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
        Menu.meals = new ArrayList<>();

        Meal meal1 = new Meal("Chicken Tikka Baguette", "Fresh Chicken with Special Sauce", 9.99);
        meal1.getIngredients().add(new Ingredient("Chicken Tikka", 5));
        meal1.getIngredients().add(new Ingredient("Bread roll", 1));
        meal1.getIngredients().add(new Ingredient("Salad", 1));
        meal1.getIngredients().add(new Ingredient("Special Sauce", 1));

        Meal meal2 = new Meal("Beef Burger", "Fresh beef with our special sauce & salad", 8.99);
        meal2.getIngredients().add(new Ingredient("Bun", 1));
        meal2.getIngredients().add(new Ingredient("Beef Pattie", 1));
        meal2.getIngredients().add(new Ingredient("Salad", 1));
        meal2.getIngredients().add(new Ingredient("Special Sauce", 1));

        Meal meal3 = new Meal("Apna Style Pizza", "Special sauce for base and fresh chicken and mince", 15.99);
        meal3.getIngredients().add(new Ingredient("Pizza dough", 1));
        meal3.getIngredients().add(new Ingredient("Minced Meat", 1));
        meal3.getIngredients().add(new Ingredient("Chicken Tikka", 1));
        meal3.getIngredients().add(new Ingredient("Vegetables", 3));
        meal3.getIngredients().add(new Ingredient("Special Sauce", 1));

        Menu.getMeals().add(meal1);
        Menu.getMeals().add(meal2);
        Menu.getMeals().add(meal3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    static public ArrayList<Meal> getMeals() {
        return meals;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public void removeMeal(Meal meal) {
        meals.remove(meal);
    }

    public boolean doesMealExist(Meal meal) {
        return Menu.getMeals().contains(meal);
    }

}
