package org.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("Sweet n Spice", "Taste and value in one");

        //give me a list of customers
        ArrayList<Customer> customers = new ArrayList<>();

        // First Cust order
        ArrayList<Meal> foodForOrder10 = new ArrayList<>();
        foodForOrder10.add(Menu.getMeals().get(2));
        Order orderTable2 = new Order(foodForOrder10);
        Customer customer1 = new Customer(2,orderTable2);

        // Second Cust Order
        ArrayList<Meal> foodForOrder12 = new ArrayList<>();
        foodForOrder12.add(Menu.getMeals().get(1));
        Order orderTable4 = new Order(foodForOrder12);
        Customer customer2 = new Customer(4,orderTable4);

        customers.addAll(Arrays.asList(customer1,customer2));



    }
}