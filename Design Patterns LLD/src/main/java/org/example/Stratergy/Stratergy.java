package org.example.Stratergy;

import org.example.Stratergy.DrivingStratergy.BusDrive;
import org.example.Stratergy.DrivingStratergy.SportsDrive;
import org.example.Stratergy.DrivingStratergy.TractorDrive;
import org.example.Stratergy.Vehicle.Bus;
import org.example.Stratergy.Vehicle.SportsCar;
import org.example.Stratergy.Vehicle.Vehicle;

public class Stratergy {
    public static void main(String[] args) {
        Vehicle bus = new Bus(new BusDrive());
        Vehicle sportsCar = new SportsCar(new SportsDrive());
        Vehicle tractor = new Bus(new TractorDrive());
        bus.drive();
        sportsCar.drive();
        tractor.drive();
    }
}
