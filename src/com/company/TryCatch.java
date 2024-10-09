package com.company;

public class TryCatch {
    private void block() {
        try {
            // This block contains the code that might throw an exception. If an exception occurs,
            // control is transferred to the appropriate catch block
        }catch (ArithmeticException e) {
            //This block contains the code that will execute when a particular type of exception is thrown.
            // The exception object (e) contains details about the error.
        }catch (NumberFormatException e) {
            // Java allows you to define multiple catch blocks to handle different types of exceptions separately.
        }finally {
            // The finally block is an optional block that can follow a try-catch structure.
            // It contains code that is guaranteed to execute regardless of whether an exception occurs or not.
            // This is useful for cleaning up resources such as closing files or database connections.
        }
    }

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
