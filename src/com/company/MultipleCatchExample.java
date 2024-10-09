package com.company;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());  // Throws NullPointerException
            int num = Integer.parseInt("ABC");  // This line is not executed due to the exception above
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer encountered.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Number format issue.");
        }
    }
}

