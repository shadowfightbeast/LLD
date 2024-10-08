#include <bits/stdc++.h>
using namespace std;
// Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
class Bird {
public:
    virtual void fly() = 0;
    virtual void make_sound() = 0;
};
class Sparrow : public Bird {
public:
    void fly() override {
        cout << "Flying" << endl;
    }
    void make_sound() override {
        cout << "Chirp chirp" << endl;
    }
};
class ToyDuck {
public:
    virtual void squeak() = 0;
};
class plasticToyDuck : public ToyDuck {
public:
    void squeak() override {
        cout << "squeak" << endl;
    }
};
class BirdAdapter : public ToyDuck {
private:
    Bird& bird_;

public:
    BirdAdapter(Bird& bird) : bird_(bird) {}
    void squeak() override {
        bird_.make_sound();
    }
};
int main() {
    Sparrow sparrow;
    plasticToyDuck toyDuck;
    ToyDuck& birdAdapter = *(new BirdAdapter(sparrow));
    sparrow.fly();
    sparrow.make_sound();

    cout << "toyDuck" << endl;
    toyDuck.squeak();
    birdAdapter.squeak();
}