package org.Restaurant;

import java.util.ArrayList;

public class Staff {
    private ArrayList<Waiter> waiters;
    private Chef chef;

    public Staff(Chef chef) {
       this.chef = chef;
       this.waiters = new ArrayList<>();
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public void addWaiters(Waiter waiter) {
        waiters.add(waiter);
    }

    public boolean doesWaiterExist(Waiter waiter) {
        return waiters.contains(waiter);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "waiters=" + waiters +
                ", chef=" + chef +
                '}';
    }
}
