package com.example.ordermanagement.model;

import com.example.ordermanagement.util.ValidationUtil;

public class OrderItem {
    private final Product product;
    private final int quantity;

    public OrderItem(Product product, int quantity) {
        ValidationUtil.validateObject(product, "Product");
        ValidationUtil.validateQuantity(quantity);

        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{product=" + product.getName() +
                ", quantity=" + quantity +
                ", itemTotal=" + getTotalPrice() + "}";
    }
}