public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // i want to avoid the null check
        Vehicle vehicle = VehicleFactory.getVehicleObject("Bike");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        // if (vehicle != null) {
        // System.out.println(vehicle.getSeatingCapacity());
        // System.out.println(vehicle.getTankCapacity());
        // }

        System.out.println(vehicle.getSeatingCapacity());
        System.out.println(vehicle.getTankCapacity());
    }
}
