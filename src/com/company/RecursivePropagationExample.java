package com.company;

public class RecursivePropagationExample {

    public static void main(String[] args) {
        try {
            recursiveMethod(5);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void recursiveMethod(int count) {
        if (count == 0) {
            int result = 10 / 0;  // ArithmeticException
        } else {
            recursiveMethod(count - 1);  // Recursive call
        }
    }
}
