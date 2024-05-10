package org.Restaurant;

import java.util.ArrayList;
import java.util.UUID;

public class Waiter {
    private UUID id;
    private ArrayList<Order> orders;

    public Waiter() {
        this.id = UUID.randomUUID();
        this.orders = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "id=" + id +
                ", orders=" + orders +
                '}';
    }
}
