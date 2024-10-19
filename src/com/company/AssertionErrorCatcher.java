package com.company;

public class AssertionErrorCatcher {
    public static void main(String[] args) {
        try {
            int age = -1;
            assert age >= 0 : "Age cannot be negative!";
        } catch (AssertionError e) {
            System.out.println("Caught an assertion error: " + e.getMessage());
        }
    }
}

