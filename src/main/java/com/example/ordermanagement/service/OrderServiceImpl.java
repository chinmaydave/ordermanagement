package com.example.ordermanagement.service;

import org.springframework.stereotype.Service;
import com.example.ordermanagement.exception.ProductNotFoundException;
import com.example.ordermanagement.model.Order;
import com.example.ordermanagement.model.OrderItem;
import com.example.ordermanagement.model.Product;
import com.example.ordermanagement.util.ValidationUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    private final Map<Integer, Product> productCatalog;
    private final Map<Integer, Order> orderStorage = new HashMap<>();

    public OrderServiceImpl() {
        this.productCatalog = new HashMap<>();

        // Seed sample data
        addProduct(new Product(1, "Laptop", 1000.00));
        addProduct(new Product(2, "Phone", 500.00));
        addProduct(new Product(3, "Headphones", 100.00));
    }

    @Override
    public Order createOrder(int orderId) {
        Order order = new Order(orderId);
        orderStorage.put(orderId, order);
        return order;
    }

    @Override
    public Order getOrder(int orderId) {
        return orderStorage.get(orderId);
    }

    @Override
    public List<Order> getAllOrders() {
        return new ArrayList<>(orderStorage.values());
    }

    @Override
    public void addProduct(Product product) {
        ValidationUtil.validateObject(product, "Product");
        productCatalog.put(product.getId(), product);
    }

    @Override
    public void addItemToOrder(int orderId, int productId, int quantity) {
        Order order = orderStorage.get(orderId);

        if (order == null) {
            throw new RuntimeException("Order not found");
        }

        Product product = productCatalog.get(productId);

        if (product == null) {
            throw new RuntimeException("Product not found");
        }

        OrderItem item = new OrderItem(product, quantity);
        order.addItem(item);
    }

    @Override
    public double getOrderTotal(Order order) {
        ValidationUtil.validateObject(order, "Order");
        return order.calculateTotal();
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(productCatalog.values());
    }

}
