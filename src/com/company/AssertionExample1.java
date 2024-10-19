package com.company;

import java.util.ArrayList;
import java.util.List;

public class AssertionExample1 {
    public static void main(String[] args) {
        int age = -5;
        assert age >= 0 : "Age cannot be negative!";
        System.out.println("Age is valid: " + age);
    }

    public int divide(int numerator, int denominator) {
        assert denominator != 0 : "Denominator should not be zero!";
        return numerator / denominator;
    }

    public List<String> initializeList() {
        List<String> list = new ArrayList<>();
        // post-condition
        assert list != null : "List should not be null after initialization";
        return list;
    }

}

