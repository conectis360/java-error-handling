package com.company;

public class CircuitBreaker {
    private static final int FAILURE_THRESHOLD = 3;
    private static final long TIMEOUT = 5000;
    private int failureCount = 0;
    private long lastFailureTime = 0;

    public boolean allowRequest() {
        if (failureCount >= FAILURE_THRESHOLD && (System.currentTimeMillis() - lastFailureTime) < TIMEOUT) {
            return false;  // Circuit breaker is open
        }
        return true;  // Circuit breaker is closed or timeout has passed
    }

    public void recordFailure() {
        failureCount++;
        lastFailureTime = System.currentTimeMillis();
    }

    public void reset() {
        failureCount = 0;
    }
}
