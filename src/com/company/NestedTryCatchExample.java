package com.company;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            try {
                int result = 10 / 0; // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Caught in inner catch: " + e.getMessage());
            }
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught in outer catch: " + e.getMessage());
        }
    }
}

