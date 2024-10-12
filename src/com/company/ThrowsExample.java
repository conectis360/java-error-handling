package com.company;

public class ThrowsExample {

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void riskyMethod() throws Exception {
        throw new Exception("Something went wrong!");
    }
}

