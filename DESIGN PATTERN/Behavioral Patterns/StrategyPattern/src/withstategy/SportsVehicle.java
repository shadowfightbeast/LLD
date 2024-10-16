package LLD_JAVA.StrategyPattern.src.withstategy;

import withstategy.strategry.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
