package org.Restaurant;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("Sweet n Spice", "Taste and value in one");

        ArrayList<Meal> mealsForOrder212 = new ArrayList<>();
        mealsForOrder212.add(Menu.getMeals().get(2));

//        System.out.println(Menu.getMeals().get(2));

        Order orderForTable10 = new Order(mealsForOrder212);

        Customer cust1 = new Customer(10, orderForTable10);
        System.out.println(cust1);
    }
}