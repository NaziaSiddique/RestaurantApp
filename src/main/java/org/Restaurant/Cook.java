package org.Restaurant;

import java.util.ArrayList;
import java.util.UUID;

public class Cook {
    private ArrayList<Order> orders;
    private UUID id;

    public Cook() {
        this.orders = new ArrayList<>();
        this.id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Cook{" +
                "orders=" + orders +
                ", id=" + id +
                '}';
    }
}
