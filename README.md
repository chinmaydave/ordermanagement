# 🧾 Order Management System (Spring Boot)

## 🚀 Overview

This project is a **Java Spring Boot backend application** that simulates a real-world Order Management System. It demonstrates core backend engineering concepts including REST APIs, layered architecture, object-oriented design, and data handling using Java collections.

The system allows users to manage products, create orders, add items to orders, and calculate totals — all through HTTP endpoints.

---

## 🧠 Key Concepts Demonstrated

* **Object-Oriented Programming (OOP)**

  * Encapsulation (private fields + getters)
  * Composition (Order → OrderItems → Product)
  * Abstraction (service interface)

* **Backend Architecture**

  * Controller layer (handles HTTP requests)
  * Service layer (business logic)
  * Model layer (data representation)

* **Spring Boot Features**

  * REST APIs using `@RestController`
  * Dependency Injection
  * Annotation-based configuration

* **Java Collections**

  * `Map<Integer, Product>` for product catalog
  * `Map<Integer, Order>` for order storage
  * `List<OrderItem>` for order items

* **Validation & Exception Handling**

  * Input validation via utility methods
  * Custom exceptions for error handling

---

## 🏗️ Project Structure

```
com.example.ordermanagement
├── controller        # REST API endpoints
├── service           # Business logic (interface + implementation)
├── model             # Core data objects (Product, Order, OrderItem)
├── util              # Validation utilities
├── exception         # Custom exception classes
└── OrderManagementApplication.java
```

---

## ⚙️ Features

* 📦 View product catalog
* 🧾 Create new orders
* ➕ Add items to an order
* 💰 Calculate total order price
* ⚠️ Handle invalid inputs and missing data

---

## 🌐 API Endpoints

### Get all products

```
GET /api/products
```

### Create a new order

```
POST /api/orders?orderId=101
```

### Add item to order

```
POST /api/orders/{orderId}/items?productId=1&quantity=2
```

### Get order details

```
GET /api/orders/{orderId}
```

---

## ▶️ How to Run

### 1. Clone the repository

```
git clone https://github.com/YOUR_USERNAME/ordermanagement.git
cd ordermanagement
```

### 2. Run the application

```
./mvnw spring-boot:run
```

### 3. Access API

```
http://localhost:8080/api/products
```

---

## 🧪 Example Workflow

1. Create an order
2. Add products to the order
3. Retrieve order details with total price

---

## 📌 Future Improvements

* Add database integration (H2/PostgreSQL)
* Implement DTOs for request/response handling
* Add user authentication
* Improve exception handling with global handlers
* Add Swagger API documentation

---

## 🎯 Why This Project Matters

This project demonstrates the ability to:

* Design and implement backend systems
* Structure code using industry best practices
* Build RESTful APIs with Spring Boot
* Work with Java collections and OOP principles

---

## 👨‍💻 Author

**Avaneesh Sattenapalli**

---
