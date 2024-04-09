package org.Restaurant;

public class Customer {
    private int tableId;
    private Order order;

    public Customer(int tableId, Order order){
        this.tableId = tableId;
        this.order = order;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "tableId=" + tableId +
                ", order=" + order +
                '}';
    }
}
