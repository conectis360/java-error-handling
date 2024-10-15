package com.company;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e);
        }
    }
}

