package LLD_JAVA.StrategyPattern.src.withstategy;

import withstategy.strategry.SportsDriveStrategy;

public class OffRoadVechile extends Vechile{

     OffRoadVechile(){super(new SportsDriveStrategy());}
}
