package com.company;

public class FinallyWithReturnExample {
    public static void main(String[] args) {
        System.out.println(methodWithFinally());
    }

    public static int methodWithFinally() {
        try {
            return 10;
        } finally {
            System.out.println("finally block executed");
        }
    }
}
