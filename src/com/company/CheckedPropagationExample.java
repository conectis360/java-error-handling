package com.company;

import java.io.IOException;

public class CheckedPropagationExample {

    public static void main(String[] args) {
        try {
            methodA();
        } catch (IOException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }

    public static void methodA() throws IOException {
        methodB();
    }

    public static void methodB() throws IOException {
        methodC();
    }

    public static void methodC() throws IOException {
        throw new IOException("File not found");
    }
}

