package org.example.Stratergy.Vehicle;

import org.example.Stratergy.DrivingStratergy.DrivingStratergy;

public abstract class Vehicle {
    private final DrivingStratergy drivingStratergy;

    Vehicle(DrivingStratergy drivingStratergy) {
        this.drivingStratergy = drivingStratergy;
    }

    public void drive() {
        drivingStratergy.drive();
    }
}
