package com.company;

import java.util.logging.*;

public class CustomExceptionLoggingExample {
    private static final Logger logger = Logger.getLogger(CustomExceptionLoggingExample.class.getName());

    public static void main(String[] args) {
        try {
            validateUserInput(-1);
        } catch (InvalidUserInputException e) {
            logger.log(Level.WARNING, "User input validation failed", e);
        }
    }

    public static void validateUserInput(int input) throws InvalidUserInputException {
        if (input < 0) {
            throw new InvalidUserInputException("Input must be positive");
        }
    }
}