package com.pluralsight.models;

import java.io.BufferedReader;
import java.io.BufferedWriter; // Add import statement
import java.io.FileReader;
import java.io.FileWriter; // Add import statement
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {
    private static final String FILE_PATH = "src/main/java/com/pluralsight/files/inventory.csv";
    private static final String DELIMITER = "|";

    public static Dealership getDealership() {
        Dealership dealership = new Dealership("", "", "");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
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
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write(dealership.getName() + DELIMITER + dealership.getAddress() + DELIMITER + dealership.getPhone());
            writer.newLine();
            for (Vehicle vehicle : dealership.getAllVehicles()) {
                writer.write(vehicle.getVin() + DELIMITER + vehicle.getYear() + DELIMITER + vehicle.getMake() + DELIMITER +
                        vehicle.getModel() + DELIMITER + vehicle.getVehicleType() + DELIMITER + vehicle.getColor() + DELIMITER +
                        vehicle.getOdometer() + DELIMITER + vehicle.getPrice());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing dealership file: " + e.getMessage());
        }
    }
}

