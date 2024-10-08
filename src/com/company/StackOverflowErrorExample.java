package com.company;

public class StackOverflowErrorExample {
    public static void main(String[] args) {
        recursiveMethod();
    }

    public static void recursiveMethod() {
        recursiveMethod(); // Causes StackOverflowError
    }
}
/*
In this example, the program crashes with a StackOverflowError due to infinite recursion.
Errors like this should not be caught or handled but should instead be avoided by proper code design.
* */
