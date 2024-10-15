package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(SLF4JLoggingExample.class);

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("Critical error: Division by zero", e);
        }
    }
}

