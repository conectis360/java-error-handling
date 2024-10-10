package com.company;

// Step 1: Create a custom exception class
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);  // Pass message to parent class (Exception)
    }
}
