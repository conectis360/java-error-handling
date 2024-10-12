package com.company;

public class PropagationNestedTryCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            try {
                riskyMethod();
            } catch (NullPointerException e) {
                System.out.println("Caught in inner catch: " + e.getMessage());
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught in outer catch: " + e.getMessage());
        }
    }

    public static void riskyMethod() {
        int result = 10 / 0; // This will throw ArithmeticException
    }
}

