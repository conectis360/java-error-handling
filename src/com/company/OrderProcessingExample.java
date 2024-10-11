package com.company;

public class OrderProcessingExample {

    public static void main(String[] args) {
        try {
            processOrder(1001);  // This will throw an exception for demonstration
        } catch (OrderProcessingException e) {
            System.out.println(e.getMessage() + " Order ID: " + e.getOrderId());
        }
    }

    public static void processOrder(int orderId) throws OrderProcessingException {
        if (orderId == 1001) {  // Simulate an error condition for orderId 1001
            throw new OrderProcessingException("Error processing order", orderId);
        } else {
            System.out.println("Order processed successfully.");
        }
    }
}

