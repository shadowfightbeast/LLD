
// Class implementing the RentalService interface

import java.util.ArrayList;
import java.util.List;

class CarRentalService implements RentalService {
    private List<Car> cars;

    public CarRentalService() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public boolean rentCar(String registrationNumber) {
        for (Car car : cars) {
            if (car.getRegistrationNumber().equals(registrationNumber) && car.getStatus() == CarStatus.AVAILABLE) {
                car.setStatus(CarStatus.RENTED);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean returnCar(String registrationNumber) {
        for (Car car : cars) {
            if (car.getRegistrationNumber().equals(registrationNumber) && car.getStatus() == CarStatus.RENTED) {
                car.setStatus(CarStatus.AVAILABLE);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Car> listAvailableCars() {
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getStatus() == CarStatus.AVAILABLE) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }
}