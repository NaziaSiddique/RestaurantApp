package org.Restaurant;

import java.util.ArrayList;

public class Chef {
    private ArrayList<Customer> customers;
    static private ArrayList<Cook> cooks;

    public Chef(Cook cook) {
        this.cooks = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    static public ArrayList<Cook> getCooks() {
        return cooks;
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

    public void addCook(Cook cook) {

        cooks.add(cook);
    }

    public boolean isCookAssigned(Cook cook) {
        return Chef.getCooks().contains(cook);
    }
}
