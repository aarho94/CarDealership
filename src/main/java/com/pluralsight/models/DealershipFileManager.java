package com.pluralsight.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {
    private static final String FILE_PATH = "src/main/java/com/pluralsight/files/inventory.csv";

    public static Dealership getDealership() {
        Dealership dealership = new Dealership("", "", "");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 8) {
                    int vin = Integer.parseInt(parts[0].trim());
                    int year = Integer.parseInt(parts[1].trim());
                    String make = parts[2].trim();
                    String model = parts[3].trim();
                    String vehicleType = parts[4].trim();
                    String color = parts[5].trim();
                    int odometer = Integer.parseInt(parts[6].trim());
                    double price = Double.parseDouble(parts[7].trim());

                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    dealership.addVehicle(vehicle);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading dealership file: " + e.getMessage());
        }
        return dealership;
    }

    public static void saveDealership(Dealership dealership) {

    }
}
