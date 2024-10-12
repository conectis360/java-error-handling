package com.company;

public class FinallyNestedTryCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            try {
                int result = 10 / 0; // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Caught in inner catch: " + e.getMessage());
            } finally {
                System.out.println("Inner finally block executed");
            }
        } catch (Exception e) {
            System.out.println("Caught in outer catch: " + e.getMessage());
        } finally {
            System.out.println("Outer finally block executed");
        }
    }
}

