package org.Restaurant;

public class Ingredient {
    private String name;
    private int quantity;
    private double unit;

    public Ingredient(String name, int quantity, double unit){
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
    this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnit() {
        return unit;
    }

    public void setUnit(double unit) {
        this.unit = unit;
    }
}
