package withstategy;

import withstategy.strategry.NormalDriveStrategy;

public class GoodVechile  extends  Vechile{
    GoodVechile() {super(new NormalDriveStrategy());}
}
