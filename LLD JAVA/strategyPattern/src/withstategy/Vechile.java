package withstategy;

import withstategy.strategry.DriveStrategy;

public class Vechile {
    DriveStrategy driveObject;
    //this is construction injection of drive object
    Vechile(DriveStrategy driveObj) {
        this.driveObject=driveObj;}
    public  void drive(){
        driveObject.drive();
    }
}
