public class ParkingLotDemo {

    public static void main(String[] args) {
        // Create a parking lot with 5 spaces
        ParkingLot parkingLot = new ParkingLot(5);

        // Create some cars
        Car car1 = new Car("ABC123");
        Car car2 = new Car("XYZ789");
        Car car3 = new Car("123XYZ");

        // Park cars in the parking lot
        parkingLot.parkCar(car1);
        parkingLot.parkCar(car2);
        parkingLot.parkCar(car3);

        // Print parking lot status
        parkingLot.printParkingLotStatus();

        // Vacate a parking space
        parkingLot.vacateSpace(2);

        // Print updated parking lot status
        parkingLot.printParkingLotStatus();
    }
}