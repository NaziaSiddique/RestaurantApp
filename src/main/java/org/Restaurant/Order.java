package org.Restaurant;

import java.util.ArrayList;

public class Order {
    private int orderId;
    public static int orderCounter = 0;
    private ArrayList<Meal> meals;
    private double price;

    public Order(ArrayList<Meal> meals){
        this.orderId = orderCounter;
        orderCounter++;
        this.price = 0;
        this.meals = meals;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", meals=" + meals +
                ", price=" + price +
                '}';
    }
}
