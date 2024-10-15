package com.company;

import java.util.logging.*;

public class LoggingLevelsExample {
    private static final Logger logger = Logger.getLogger(LoggingLevelsExample.class.getName());

    public static void main(String[] args) {
        logger.severe("This is a FATAL level log");
        logger.warning("This is a WARNING level log");
        logger.info("This is an INFO level log");
        logger.fine("This is a DEBUG level log");
        logger.finest("This is a TRACE level log");
    }
}

