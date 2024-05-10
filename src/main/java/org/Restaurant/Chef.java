package org.Restaurant;

import java.util.ArrayList;

public class Chef {
    private ArrayList<Customer> customers;
    private ArrayList<Cook> cooks;

    public Chef() {
        this.cooks = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Chef{" +
                "customers=" + customers +
                ", cooks=" + cooks +
                '}';
    }

    public static void assignMealsToCook(){

    }

    public static void assignReadyMealsToWaiters(){

    }
}
