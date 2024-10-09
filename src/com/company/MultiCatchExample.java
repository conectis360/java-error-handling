package com.company;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("XYZ");  // This will throw NumberFormatException
        } catch (NullPointerException | NumberFormatException numberFormatException) {
            System.out.println("Error: Invalid operation encountered.");
        }
    }
}
