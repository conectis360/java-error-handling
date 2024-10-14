package com.company;

public class RealTimeSystem {
    private static final CustomException preAllocatedException = new CustomException("Pre-allocated exception");

    public static void main(String[] args) {
        try {
            // Pre-allocate exception to avoid dynamic memory allocation
            throw preAllocatedException;
        } catch (CustomException e) {
            handleException(e);
        }
    }

    public static void handleException(CustomException e) {
        // Handle exception with minimal overhead
        System.out.println("Handled exception: " + e.getMessage());
    }
}

