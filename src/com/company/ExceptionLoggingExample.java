package com.company;

import java.util.logging.*;

public class ExceptionLoggingExample {
    private static final Logger logger = Logger.getLogger(ExceptionLoggingExample.class.getName());

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "Arithmetic exception occurred", e);
        }
    }
}

