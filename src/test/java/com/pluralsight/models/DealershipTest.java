package com.pluralsight.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class DealershipTest {
    private Dealership dealership;

    @Test
    public void testAddVehicle() {
        // Create a vehicle to add to the dealership
        Vehicle vehicle = new Vehicle(12345, 2020, "Toyota", "Camry", "Car", "Red", 10000, 25000.00);

        // Add the vehicle to the dealership
        dealership.addVehicle(vehicle);

        // Verify that the vehicle was added successfully
        assertTrue(dealership.getAllVehicles().contains(vehicle));
    }

    @Test
    public void testRemoveVehicle() {
        // Create a vehicle and add it to the dealership
        Vehicle vehicle = new Vehicle(12345, 2020, "Toyota", "Camry", "Car", "Red", 10000, 25000.00);
        dealership.addVehicle(vehicle);

        // Remove the vehicle from the dealership
        dealership.removeVehicle(vehicle);

        // Verify that the vehicle was removed successfully
        assertFalse(dealership.getAllVehicles().contains(vehicle));
    }

}
