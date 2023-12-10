#include <bits/stdc++.h>
using namespace std;
// pattern are also known as virtual contsructor
//  subclasses are responsible to create the instances ofthe class
class Plan
{
protected:
    double rate;

public:
    virtual void getRate() = 0;
    void calculateBill(int units)
    {
        cout << units * rate << endl;
    }
};
class DomesticPlan : public Plan
{
public:
    void getRate()
    {
        rate = 3.50;
    }
};
class CommercialPlan : public Plan
{
public:
    void getRate()
    {
        rate = 7.50;
    }
};
class InstutionalPlan : public Plan
{
public:
    void getRate()
    {
        rate = 5.50;
    }
};

class getFactoryPlan : public Plan
{
public:
    static Plan *getPlan(string planType)
    {
        Plan *pl;
        if (planType == "")
            return NULL;
        if (planType == "DOMESTICPLAN")
        {
            pl = new DomesticPlan();
        }
        else if (planType == "COMMERCIALPLAN")
        {
            pl = new CommercialPlan();
        }
        else if (planType == "INSTUTIONALPLAN")
            pl = new InstutionalPlan();
        return pl;
    }
};

int main()
{
    int units;
    string planType;
    cout << "Enter the name of plan" << endl;
    cin >> planType;
    cout << "Enter the number of units" << endl;
    cin >> units;
    cout << "BIL amount for " << planType << endl;
    Plan *pl = getFactoryPlan::getPlan(planType);
    pl->getRate();
    pl->calculateBill(units);

    return 0;
}