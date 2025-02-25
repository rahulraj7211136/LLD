package Stratergy.DriveStratergy.Vehicle;

import Stratergy.DriveStratergy.DriveStratergy;

public class Vehicle {
    DriveStratergy driveStratergy;

    Vehicle(DriveStratergy driveStratergy) {
        this.driveStratergy = driveStratergy;
    }
    public void drive() {
        this.driveStratergy.drive();
    }
}
