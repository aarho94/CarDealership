package com.pluralsight.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class DealershipTest {
    private Dealership dealership;

    @Test
    public void testAddVehicle_shouldAddVehicle_toDealership() {
        // Arrange
        Vehicle vehicle = new Vehicle(12345, 2020, "Toyota", "Camry", "Car", "Red", 10000, 25000.00);

        // Act
        dealership.addVehicle(vehicle);

        // Assert
        assertTrue(dealership.getAllVehicles().contains(vehicle));
    }


    @Test
    public void testRemoveVehicle_shouldRemoveVehicle_fromDealership() {
        // Arrange
        Vehicle vehicle = new Vehicle(12345, 2020, "Toyota", "Camry", "Car", "Red", 10000, 25000.00);
        dealership.addVehicle(vehicle);

        // Act
        dealership.removeVehicle(vehicle);

        // Assert
        assertFalse(dealership.getAllVehicles().contains(vehicle));
    }


}
