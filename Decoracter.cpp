#include <bits/stdc++.h>
using namespace std;
class MilkShake
{
public:
    virtual string Serve() = 0;
    virtual float price() = 0;
};
class BaseMilkShake : public MilkShake
{
public:
    string Serve()
    {
        return "MilkShake";
    }
    float price()
    {
        return 30;
    }
};
class MilkShakeDecorator : public MilkShake
{
protected:
    MilkShake *m_Milkshake;

public:
    MilkShakeDecorator(MilkShake *BaseMilkShake) : m_Milkshake(BaseMilkShake) {}
    string Serve()
    {
        return m_Milkshake->Serve();
    }
    float price()
    {
        return m_Milkshake->price();
    }
};
class MangoMilkShake : public MilkShakeDecorator
{
public:
    MangoMilkShake(MilkShake *baseMilkShake) : MilkShakeDecorator(baseMilkShake) {}

    string Serve()
    {
        return m_Milkshake->Serve() + " decorated with Mango ";
    }
    float price()
    {
        return m_Milkshake->price() + 40;
    }
};
class VanillaMilkShake : public MilkShakeDecorator
{
public:
    VanillaMilkShake(MilkShake *baseMilkshake) : MilkShakeDecorator(baseMilkshake) {}
    string Serve()
    {
        return m_Milkshake->Serve() + " decorated with Vanilla  ";
    }
    float price()
    {
        return m_Milkshake->price() + 80;
    }
};
int main()
{
    MilkShake *baseMilkShake = new BaseMilkShake();
    cout << "base milkshake" << endl;
    cout << baseMilkShake->Serve() << endl;
    cout << baseMilkShake->price() << endl;

    MilkShake *decorateMilkShake = new MangoMilkShake(baseMilkShake);
    cout << decorateMilkShake->Serve() << endl;
    cout << decorateMilkShake->price() << endl;

    delete decorateMilkShake;

    
    decorateMilkShake = new VanillaMilkShake(baseMilkShake);
    cout << decorateMilkShake->Serve() << endl;
    cout << decorateMilkShake->price() << endl;

    return 0;
}