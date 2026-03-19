package com.example.ordermanagement.util;

public final class ValidationUtil {

    private ValidationUtil() {
        // Prevent instantiation
    }

    public static void validateId(int id, String fieldName) {
        if (id <= 0) {
            throw new IllegalArgumentException(fieldName + " must be greater than 0");
        }
    }

    public static void validateText(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be null or empty");
        }
    }

    public static void validatePrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }

    public static void validateQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
    }

    public static void validateObject(Object obj, String fieldName) {
        if (obj == null) {
            throw new IllegalArgumentException(fieldName + " cannot be null");
        }
    }
}