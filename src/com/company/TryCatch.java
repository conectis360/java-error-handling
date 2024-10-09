package com.company;

public class TryCatch {
    private void block() {
        try {
            // This block contains the code that might throw an exception. If an exception occurs,
            // control is transferred to the appropriate catch block
        }catch (Exception e) {
            //This block contains the code that will execute when a particular type of exception is thrown.
            // The exception object (e) contains details about the error.
        }finally {
            // The finally block is an optional block that can follow a try-catch structure.
            // It contains code that is guaranteed to execute regardless of whether an exception occurs or not.
            // This is useful for cleaning up resources such as closing files or database connections.
        }
    }

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);  // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
