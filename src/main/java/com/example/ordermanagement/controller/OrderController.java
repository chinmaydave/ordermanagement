package com.example.ordermanagement.controller;

import com.example.ordermanagement.model.Order;
import com.example.ordermanagement.model.Product;
import com.example.ordermanagement.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return orderService.getAllProducts();
    }

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping("/orders")
    public Order createOrder(@RequestParam int orderId) {
        return orderService.createOrder(orderId);
    }

    @PostMapping("/orders/{orderId}/items")
    public String addItem(
            @PathVariable int orderId,
            @RequestParam int productId,
            @RequestParam int quantity) {

        orderService.addItemToOrder(orderId, productId, quantity); // ✅ FIX
        return "Item added";
    }

    @GetMapping("/orders/{orderId}")
    public Order getOrder(@PathVariable int orderId) {
        return orderService.getOrder(orderId);
    }
}
