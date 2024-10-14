package com.company;

public class RealTimeSafetySystem {
    public static void main(String[] args) {
        try {
            executeSafetyCriticalTask();
        } catch (SafetyException e) {
            moveToSafeState();
        }
    }

    public static void executeSafetyCriticalTask() throws SafetyException {
        if (taskFails()) {
            throw new SafetyException("Safety-critical task failed");
        }
    }

    public static void moveToSafeState() {
        // Move the system to a safe state to prevent unsafe behavior
        System.out.println("System moved to safe state.");
    }

    private static boolean taskFails() {
        return true; // Simulating task failure
    }
}

