package com.company;

public class MyClass {

    private final int value;


    public MyClass(int value) {

        this.value = value;

    }


    public int divideBy(int divisor) {

        try {

            return value / divisor;

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}