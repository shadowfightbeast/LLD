package LLD_JAVA.StrategyPattern.src.withstategy;

import withstategy.strategry.SportsDriveStrategy;

public class SportsVechile extends  Vechile{
    SportsVechile(){super(new SportsDriveStrategy());}
}
