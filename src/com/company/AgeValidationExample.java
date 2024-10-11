package com.company;

public class AgeValidationExample {

    public static void main(String[] args) {
        try {
            validateAge(15);  // This will throw AgeValidationException
        } catch (AgeValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateAge(int age) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("Age must be 18 or above.");
        } else {
            System.out.println("Valid age.");
        }
    }
}

