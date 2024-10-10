package com.company;

public class ThrowExample {

        public static void main(String[] args) {
            try {
                checkAge(15);  // Age below the required threshold
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }

        public static void checkAge(int age) throws Exception {
            if (age < 18) {
                throw new Exception("Age must be 18 or above.");
            }
            System.out.println("Age is valid.");
        }
    }

