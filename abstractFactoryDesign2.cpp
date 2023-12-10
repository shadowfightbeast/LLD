#include <bits/stdc++.h>
using namespace std;
class Car
{
public:
    virtual void car() = 0;
};
class ToyotaCar : public Car
{
public:
    void car()
    {
        cout << "Toyota car" << endl;
    }
};
class HyundaiCar : public Car
{
public:
    void car()
    {
        cout << "HYundai car" << endl;
    }
};
class Bike
{
public:
    virtual void bike() = 0;
};
class HyundaiBike : public Bike
{
public:
    void bike()
    {
        cout << "Hyundai Bike" << endl;
    }
};
class ToyotaBike : public Bike
{
public:
    void bike()
    {
        cout << "Toyota Bike" << endl;
    }
};
class VechileFactory
{
public:
    virtual Car *CreateCar() = 0;
    virtual Bike *CreateBike() = 0;
};
class HyudaiFactory : public VechileFactory
{
public:
    Car *CreateCar()
    {
        return new HyundaiCar();
    }
    Bike *CreateBike()
    {
        return new HyundaiBike();
    }
};
class ToyotaFactory : public VechileFactory
{
public:
    Car *CreateCar()
    {
        return new ToyotaCar();
    }
    Bike *CreateBike()
    {
        return new ToyotaBike();
    }
};
class MAINAbstractFactory
{
public:
    static VechileFactory *createFactory(string company)
    {
        if (company == "hyundai")
        {
            return new HyudaiFactory();
        }
        if (company == "toyota")
        {
            return new ToyotaFactory();
        }
        return new ToyotaFactory();
    }
};

int main()
{
    string name = "hyundai";
    VechileFactory *fact = MAINAbstractFactory::createFactory(name);
    Bike *bike = fact->CreateBike();
    bike->bike();

    Car *car = fact->CreateCar();
    car->car();

    return 0;
}