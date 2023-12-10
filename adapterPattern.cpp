#include <bits/stdc++.h>
using namespace std;
class Bird
{
public:
    virtual void fly() = 0;
    virtual void makesound() = 0;
};
class Sparrow : public Bird
{
public:
    void fly() override
    {
        cout << "Flying" << endl;
    }
    void makesound() override
    {
        cout << "Chirp chrirp" << endl;
    }
};
class ToyDuck
{
public:
    virtual void squeak() = 0;
};
class plasticToyDuck : public ToyDuck
{
public:
    void squeak() override
    {
        cout << "squeak" << endl;
    }
};
class BirdAdapter : public ToyDuck
{
private:
    Bird &bird_;

public:
    BirdAdapter(Bird &bird) : bird_(bird) {}
    void squeak() override
    {
        bird_.makesound();
    }
};
int main()
{
    Sparrow sparrow;
    plasticToyDuck toyDuck;
    ToyDuck &birdAdapter = *(new BirdAdapter(sparrow));
    sparrow.fly();
    sparrow.makesound();

    cout << "toyDuck" << endl;
    toyDuck.squeak();
    birdAdapter.squeak();
}