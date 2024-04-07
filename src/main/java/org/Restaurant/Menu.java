package org.Restaurant;
import java.util.ArrayList;

public class Menu {
    private String name;
    private String description;
    private ArrayList<Meal> meals;

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
        this.meals = new ArrayList<>();
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

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }
}