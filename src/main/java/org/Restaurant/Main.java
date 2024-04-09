package org.Restaurant;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("Sweet n Spice", "Taste and value in one");

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

        ArrayList<Meal> mealsForOrder212 = new ArrayList<>();
        mealsForOrder212.add(Menu.getMeals().get(2));

//        System.out.println(Menu.getMeals().get(2));

        Order orderForTable10 = new Order(212, mealsForOrder212);

        Customer cust1 = new Customer(10, orderForTable10);
        System.out.println(cust1);
    }
}