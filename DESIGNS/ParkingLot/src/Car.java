package LLD_JAVA.ParkingLot.src;

public class Car {

    private String licensePlate;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getRegistrationNumber() {
        throw new UnsupportedOperationException("Unimplemented method 'getRegistrationNumber'");
    }

    public void setStatus(CarStatus rented) {
        throw new UnsupportedOperationException("Unimplemented method 'setStatus'");
    }
}
