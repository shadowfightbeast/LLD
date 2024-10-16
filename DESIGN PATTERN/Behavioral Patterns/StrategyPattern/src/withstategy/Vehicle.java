package LLD_JAVA.StrategyPattern.src.withstategy;

import withstategy.strategry.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;

    // this is construction injection of drive object
    Vehicle(DriveStrategy driveObj) {
        this.driveObject = driveObj;
    }

    public void drive() {
        driveObject.drive();
    }
}
