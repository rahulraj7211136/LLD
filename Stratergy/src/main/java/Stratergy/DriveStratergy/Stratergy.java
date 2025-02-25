package Stratergy.DriveStratergy;

import Stratergy.DriveStratergy.Vehicle.*;


public class Stratergy {
    public static void main(String[] args) {
        Vehicle race = new RaceVehicle(new RaceDrive());
        race.drive();
        Vehicle normal = new NormalVehicle(new NormalDrive());
        normal.drive();
    }
}
