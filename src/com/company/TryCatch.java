package com.company;

public class TryCatch {
    private void block() {
        try {
            // This block contains the code that might throw an exception. If an exception occurs,
            // control is transferred to the appropriate catch block
        }catch (Exception e) {
            //This block contains the code that will execute when a particular type of exception is thrown.
            // The exception object (e) contains details about the error.
        }
    }

    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
