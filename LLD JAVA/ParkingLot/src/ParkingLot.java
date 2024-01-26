
// Class to represent a parking lot

import java.util.ArrayList;
import java.util.List;

class ParkingLot {
    private List<ParkingSpace> spaces;

    public ParkingLot(int numSpaces) {
        spaces = new ArrayList<>();
        for (int i = 1; i <= numSpaces; i++) {
            spaces.add(new ParkingSpace(i));
        }
    }

    public void parkCar(Car car) {
        for (ParkingSpace space : spaces) {
            if (!space.isOccupied()) {
                space.parkCar(car);
                return;
            }
        }
        System.out.println("Sorry, the parking lot is full. Cannot park " + car.getLicensePlate());
    }

    public void vacateSpace(int spaceNumber) {
        for (ParkingSpace space : spaces) {
            if (space.getNumber() == spaceNumber) {
                space.vacateSpace();
                return;
            }
        }
        System.out.println("Invalid parking space number: " + spaceNumber);
    }

    public void printParkingLotStatus() {
        System.out.println("Parking Lot Status:");
        for (ParkingSpace space : spaces) {
            System.out.println("Space " + space.getNumber() + ": " +
                    (space.isOccupied() ? "Occupied by " + space.getParkedCar().getLicensePlate() : "Vacant"));
        }
    }
}