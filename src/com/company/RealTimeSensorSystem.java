package com.company;

public class RealTimeSensorSystem {
    public static void main(String[] args) {
        try {
            readSensorData();
        } catch (SensorException e) {
            // Lightweight handling of sensor exception
            handleSensorError();
        }
    }

    public static void readSensorData() throws SensorException {
        // Simulate a sensor failure
        if (sensorFails()) {
            throw new SensorException("Sensor failure");
        }
    }

    public static void handleSensorError() {
        // Minimal overhead error handling
        System.out.println("Sensor error handled gracefully.");
    }

    private static boolean sensorFails() {
        return true; // Simulating a failure
    }
}
