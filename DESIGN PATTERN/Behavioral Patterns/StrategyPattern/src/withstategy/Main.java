package LLD_JAVA.StrategyPattern.src.withstategy;

public class Main {
    public static void main(String args[]) {
        // Vehicle vehicle=new SportsVehicle();
        Vehicle vehicle = new GoodVehicle();
        vehicle.drive();
    }
}
