package com.company;

public class CircuitBreakerExample {
    private static CircuitBreaker circuitBreaker = new CircuitBreaker();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                if (circuitBreaker.allowRequest()) {
                    performOperation();
                    circuitBreaker.reset();  // Success, reset the breaker
                } else {
                    System.out.println("Circuit breaker is open, skipping request");
                }
            } catch (Exception e) {
                System.out.println("Operation failed: " + e.getMessage());
                circuitBreaker.recordFailure();
            }
        }
    }

    public static void performOperation() throws Exception {
        if (Math.random() > 0.7) {
            System.out.println("Operation succeeded");
        } else {
            throw new Exception("Service failure");
        }
    }
}

