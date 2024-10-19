package com.company;

import java.sql.SQLException;

class DatabaseException extends Exception {
    public DatabaseException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class ExceptionWrappingExample {
    public static void main(String[] args) {
        try {
            connectToDatabase();
        } catch (DatabaseException e) {
            System.out.println("Application-level exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void connectToDatabase() throws DatabaseException {
        try {
            // Simulating a lower-level exception
            throw new SQLException("Unable to connect to database");
        } catch (SQLException e) {
            // Wrap the SQLException into a higher-level DatabaseException
            throw new DatabaseException("Failed to connect to the database", e);
        }
    }
}

