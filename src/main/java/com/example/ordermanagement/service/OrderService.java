package com.example.ordermanagement.service;

import com.example.ordermanagement.model.Order;
import com.example.ordermanagement.model.Product;

import java.util.List;

public interface OrderService {

    Order createOrder(int orderId);

    void addItemToOrder(int orderId, int productId, int quantity);

    Order getOrder(int orderId);
    
    void addProduct(Product product);

    double getOrderTotal(Order order);

    List<Product> getAllProducts();
}