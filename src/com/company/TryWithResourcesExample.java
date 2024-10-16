package com.company;

import java.io.*;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line = reader.readLine();
            System.out.println("Read line: " + line);
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}

