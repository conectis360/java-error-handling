package com.company;

public class AssertionExample {
    public static void main(String[] args) {
        int value = -1;
        assert value > 0 : "Value must be positive"; // This will throw AssertionError if value is negative
        System.out.println("Value is positive");
    }
}

