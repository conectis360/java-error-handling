package com.company;

import java.io.*;

public class FinallyResourceCleanUp {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            String line = reader.readLine();
            System.out.println("Read line: " + line);
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();  // Clean up resource
                }
            } catch (IOException e) {
                System.out.println("Error closing the reader.");
            }
        }
    }
}
