package org.Restaurant;

import java.util.ArrayList;

public class Restaurant {
    private ArrayList<Customer> customers;
    private Staff staff;
    private Menu menu;
    private Manager manager;

    public Restaurant(Staff staff, Menu menu, Manager manager){
        this.menu = menu;
        this.staff = staff;
        this.manager = manager;
        this.customers = new ArrayList<>();
    }


    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void addCustomer(Customer customer ){

    }

    public static void assignCustomerToChef(Customer customer){

    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "customers=" + customers +
                ", staff=" + staff +
                ", menu=" + menu +
                '}';
    }
}
