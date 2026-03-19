package com.example.ordermanagement.model;

import com.example.ordermanagement.util.ValidationUtil;

public class Product {
    private final int id;
    private final String name;
    private final double price;

    public Product(int id, String name, double price) {
        ValidationUtil.validateId(id, "Product ID");
        ValidationUtil.validateText(name, "Product name");
        ValidationUtil.validatePrice(price);

        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
    }
}