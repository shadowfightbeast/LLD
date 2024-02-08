package LLD_JAVA.ParkingLot.src;

class ParkingSpace {
    private int number;
    private boolean occupied;
    private Car parkedCar;

    public ParkingSpace(int number) {
        this.number = number;
        this.occupied = false;
        this.parkedCar = null;
    }

    public int getNumber() {
        return number;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public Car getParkedCar() {
        return parkedCar;
    }

    public void parkCar(Car car) {
        if (!occupied) {
            parkedCar = car;
            occupied = true;
            System.out.println("Car parked in space " + number);
        } else {
            System.out.println("Parking space " + number + " is already occupied");
        }
    }

    public void vacateSpace() {
        if (occupied) {
            parkedCar = null;
            occupied = false;
            System.out.println("Space " + number + " is now vacant");
        } else {
            System.out.println("Parking space " + number + " is already vacant");
        }
    }
}