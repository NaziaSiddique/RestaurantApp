package org.Restaurant;
import java.util.ArrayList;

public class Meal {
    private String name;
    private String description;
    private int price;
    private ArrayList<Ingredient> ingredients;

    public Meal(String name, String description, int price){
        this.name = name;
        this.description = description;
        this.price = price;
        this.ingredients = new ArrayList<>();
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
