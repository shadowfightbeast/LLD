import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create cars
        Car car1 = new Car("ABC123", "Toyota", "Camry", 50.0);
        Car car2 = new Car("XYZ456", "Honda", "Accord", 60.0);

        // Create car rental service
        CarRentalService rentalService = new CarRentalService();

        // Add cars to the rental service
        rentalService.addCar(car1);
        rentalService.addCar(car2);

        // Rent a car
        rentalService.rentCar("ABC123");

        // List available cars
        List<Car> availableCars = rentalService.listAvailableCars();
        System.out.println("Available Cars:");
        for (Car car : availableCars) {
            System.out.println(car.getRegistrationNumber() + " - " + car.getBrand() + " " + car.getModel());
        }

        // Return the rented car
        rentalService.returnCar("ABC123");

        // List available cars again
        availableCars = rentalService.listAvailableCars();
        System.out.println("Available Cars:");
        for (Car car : availableCars) {
            System.out.println(car.getRegistrationNumber() + " - " + car.getBrand() + " " + car.getModel());
        }
    }
}
