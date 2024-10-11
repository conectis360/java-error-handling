package com.company;

public class OrderProcessingException extends Exception {
    private int orderId;

    public OrderProcessingException(String message, int orderId) {
        super(message);
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }
}

