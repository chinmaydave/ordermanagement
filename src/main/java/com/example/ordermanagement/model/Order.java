package com.example.ordermanagement.model;

import com.example.ordermanagement.util.ValidationUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private final int orderId;
    private final List<OrderItem> items;

    public Order(int orderId) {
        ValidationUtil.validateId(orderId, "Order ID");

        this.orderId = orderId;
        this.items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        ValidationUtil.validateObject(item, "Order item");
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<OrderItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    @Override
    public String toString() {
        return "Order{orderId=" + orderId + ", total=" + calculateTotal() + "}";
    }
}
