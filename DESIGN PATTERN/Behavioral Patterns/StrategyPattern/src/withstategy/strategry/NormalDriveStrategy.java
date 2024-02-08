package LLD_JAVA.StrategyPattern.src.withstategy.strategry;

public class NormalDriveStrategy implements  DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive stragetgy");
    }
}
