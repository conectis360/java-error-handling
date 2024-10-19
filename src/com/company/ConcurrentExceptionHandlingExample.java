package com.company;

import java.util.concurrent.*;

public class ConcurrentExceptionHandlingExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> future = executor.submit(() -> {
            if (Math.random() > 0.5) {
                throw new RuntimeException("Error in thread");
            }
            return 42;
        });

        try {
            System.out.println("Result: " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Exception in worker thread: " + e.getMessage());
        } finally {
            executor.shutdown();
        }
    }
}

