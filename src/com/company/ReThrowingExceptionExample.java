package com.company;

public class ReThrowingExceptionExample {
    public static void main(String[] args) {
        try {
            processTransaction();
        } catch (ApplicationException e) {
            System.out.println("Handling re-thrown exception: " + e.getMessage());
        }
    }

    public static void processTransaction() throws ApplicationException {
        try {
            throw new DatabaseException("Database connection failed");
        } catch (DatabaseException e) {
            System.out.println("Logging the exception: " + e.getMessage());
            // Re-throw the exception to be handled at a higher level
            throw e;
        }
    }
}

