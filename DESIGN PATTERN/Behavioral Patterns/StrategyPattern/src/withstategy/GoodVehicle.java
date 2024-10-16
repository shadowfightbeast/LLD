package LLD_JAVA.StrategyPattern.src.withstategy;

import withstategy.strategry.NormalDriveStrategy;

public class GoodVehicle extends Vehicle {
    GoodVehicle() {
        super(new NormalDriveStrategy());
    }
}
