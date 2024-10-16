package LLD_JAVA.StrategyPattern.src.withstategy;

import withstategy.strategry.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

     OffRoadVehicle() {
          super(new SportsDriveStrategy());
     }
}
