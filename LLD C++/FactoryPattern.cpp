#include <bits/stdc++.h>
using namespace std;
// Pattern are also known as virtual constructor
// Subclasses are responsible to create the instances of the class
class Vehicle {
public:
    virtual void createVehicle() = 0;
};

class Bike : public Vehicle {
public:
    void createVehicle() {
        cout << "CREATING A BIKE" << endl;
    }
};
class Car : public Vehicle {
public:
    void createVehicle() {
        cout << "CREATING A Car" << endl;
    }
};
class VehicleFactory : public Vehicle {
public:
    static Vehicle* getVehicle(string VehicleType) {
        Vehicle* vobj;
        if (VehicleType == "Bike")
            vobj = new Bike();
        else if (VehicleType == "Car")
            vobj = new Car();
        return vobj;
    }
};

int main() {
    // string VehicleType;
    // cin >> VehicleType;
    // Vehicle *vobj;
    // if (VehicleType == "Bike")
    //     vobj = new Bike();
    // else if (VehicleType == "Car")
    //     vobj = new Car();
    // vobj->createVehicle();
    //----------------------------------------
    string VehicleType;
    cin >> VehicleType;
    Vehicle* vobj = VehicleFactory::getVehicle(VehicleType);
    vobj->createVehicle();
    return 0;
}