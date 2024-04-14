package org.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("Sweet n Spice", "Taste and value in one");

//        ArrayList<Meal> foodForOrder100 = new ArrayList<>();
//        foodForOrder100.add(Menu.getMeals().get(1));
//        Order orderForTable5 = new Order(foodForOrder100);
//        Customer cust = new Customer(5, orderForTable5);

        // How to add one customer in one line
        Customer newCust = new Customer(4, new Order(new ArrayList<Meal>(Arrays.asList(Menu.getMeals().get(0), Menu.getMeals().get(1)))));
        System.out.println(newCust);


    }
}