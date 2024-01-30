
// Interface for a rental service

import java.util.List;

interface RentalService {
    boolean rentCar(String registrationNumber);

    boolean returnCar(String registrationNumber);

    List<Car> listAvailableCars();
}