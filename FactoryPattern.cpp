#include <bits/stdc++.h>
using namespace std;
// pattern are also known as virtual contsructor
//  subclasses are responsible to create the instances ofthe class
class Vechile
{
public:
    virtual void createVechile() = 0;
};
class Bike : public Vechile
{
public:
    void createVechile()
    {
        cout << "CREATING A BIKE" << endl;
    }
};
class Car : public Vechile
{
public:
    void createVechile()
    {
        cout << "CREATING A Car" << endl;
    }
};
class VechileFactory : public Vechile
{
public:
    static Vechile *getVechile(string VechileType)
    {
        Vechile *vobj;
        if (VechileType == "Bike")
            vobj = new Bike();
        else if (VechileType == "Car")
        {
            vobj = new Car();
        }
        return vobj;
    }
};

int main()
{
    // string VechileType;
    // cin >> VechileType;
    // Vechile *vobj;
    // if (VechileType == "Bike")
    //     vobj = new Bike();
    // else if (VechileType == "Car")
    //     vobj = new Car();
    // vobj->createVechile();
    //----------------------------------------
    string VechileType;
    cin >> VechileType;
    Vechile *vobj = VechileFactory::getVechile(VechileType);
    vobj->createVechile();
    return 0;
}