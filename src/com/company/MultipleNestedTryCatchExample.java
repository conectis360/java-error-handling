package com.company;

public class MultipleNestedTryCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught in inner catch 1: " + e.getMessage());
            }
            try {
                String str = null;
                System.out.println(str.length()); // NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Caught in inner catch 2: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Caught in outer catch: " + e.getMessage());
        }
    }
}
