package withstategy;

import withstategy.strategry.SportsDriveStrategy;

public class SportsVechile extends  Vechile{
    SportsVechile(){super(new SportsDriveStrategy());}
}
