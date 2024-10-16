
public class VehicleFactory {

    public static Vehicle getVehicleObject(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        }
        // return null; //instead of returning null we return NULL Object
        return new NullVehicle();
    }

}
