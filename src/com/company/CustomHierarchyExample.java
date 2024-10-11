package com.company;

// Base custom exception
public class ApplicationException extends Exception {
    public ApplicationException(String message) {
        super(message);
    }
}

// Specific custom exception
public class DatabaseException extends ApplicationException {
    public DatabaseException(String message) {
        super(message);
    }
}

// Another specific custom exception
public class NetworkException extends ApplicationException {
    public NetworkException(String message) {
        super(message);
    }
}
