package com.company;

public class ExceptionTranslationExample {
    public static void main(String[] args) {
        try {
            connectToDatabase();
        } catch (DatabaseException e) {
            System.out.println("Caught translated exception: " + e.getMessage());
        }
    }

    public static void connectToDatabase() throws DatabaseException {
        try {
            // Simulate a lower-level exception (e.g., SQLException)
            throw new SQLException("Connection failed");
        } catch (SQLException e) {
            // Wrap and re-throw the exception as a custom DatabaseException
            throw new DatabaseException("Failed to connect to the database: " + e.getMessage());
        }
    }
}

