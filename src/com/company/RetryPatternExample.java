package com.company;

import java.io.IOException;

public class RetryPatternExample {
    public static void main(String[] args) {
        try {
            performOperationWithRetry();
        } catch (Exception e) {
            System.out.println("Operation failed after retries: " + e.getMessage());
        }
    }

    public static void performOperationWithRetry() throws Exception {
        int attempts = 0;
        int maxRetries = 3;
        while (attempts < maxRetries) {
            try {
                attempts++;
                performOperation();
                return;  // Success
            } catch (IOException e) {
                System.out.println("Attempt " + attempts + " failed: " + e.getMessage());
                if (attempts == maxRetries) {
                    throw new Exception("Operation failed after " + maxRetries + " retries", e);
                }
                Thread.sleep(1000);  // Wait before retrying
            }
        }
    }

    public static void performOperation() throws IOException {
        if (Math.random() > 0.7) {
            System.out.println("Operation succeeded");
        } else {
            throw new IOException("Network error");
        }
    }
}

