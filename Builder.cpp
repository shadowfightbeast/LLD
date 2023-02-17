#include <bits/stdc++.h>
using namespace std;
class Desktop
{
    string mointer;
    string mouse;
    string keyboard;
    string ram;
    string speaker;
    string processor;
    string motherboard;

public:
    void setMoniter(string Pmoniter)
    {
        mointer = Pmoniter;
    }
    void setMouse(string pMouse)
    {
        mouse = pMouse;
    }
    void setKeyboard(string pKeyboard)
    {
        keyboard = pKeyboard;
    }
    void setRam(string pRam)
    {
        ram = pRam;
    }
    void setProcessor(string pProcessor)
    {
        processor = pProcessor;
    }
    void setMotherBoard(string pMotherboard)
    {
        motherboard = pMotherboard;
    }
    void setSpeaker(string pSpeaker)
    {
        speaker = pSpeaker;
    }
    void showspecs()
    {
        cout << mointer << endl;
        cout << keyboard << endl;
        cout << mouse << endl;
        cout << speaker << endl;
        cout << ram << endl;
        cout << motherboard << endl;
        cout << processor << endl;
    }
};
class DesktopBuilder
{
protected:
    Desktop *desktop;

public:
    DesktopBuilder()
    {
        desktop = new Desktop();
    }
    virtual void buildMoniter() = 0;
    virtual void buildMouse() = 0;
    virtual void buildKeyboard() = 0;
    virtual void buildSpeaker() = 0;
    virtual void buildRam() = 0;
    virtual void buildProcessor() = 0;
    virtual void buildMotherboard() = 0;
    virtual Desktop *getDesktop()
    {
        return desktop;
    }
};
class DellDesktopbuilder : public DesktopBuilder
{
    void buildMoniter()
    {
        desktop->setMoniter("Dell Monitor");
    }
    void buildKeyboard()
    {
        desktop->setKeyboard("Dell Keyboard");
    }
    void buildMouse()
    {
        desktop->setMouse("Dell Mouse");
    }
    void buildSpeaker()
    {
        desktop->setSpeaker("Dell Speaker");
    }
    void buildRam()
    {
        desktop->setRam("Dell Ram");
    }
    void buildMotherboard()
    {
        desktop->setMotherBoard("Dell MotherBoard");
    }
    void buildProcessor()
    {
        desktop->setProcessor("Dell Processor");
    }
};
class HPDesktopbuilder : public DesktopBuilder
{
    void buildMoniter()
    {
        desktop->setMoniter("HP Monitor");
    }
    void buildKeyboard()
    {
        desktop->setKeyboard("HP Keyboard");
    }
    void buildMouse()
    {
        desktop->setMouse("HP Mouse");
    }
    void buildSpeaker()
    {
        desktop->setSpeaker("HP Speaker");
    }
    void buildRam()
    {
        desktop->setRam("HP Ram");
    }
    void buildMotherboard()
    {
        desktop->setMotherBoard("HP MotherBoard");
    }
    void buildProcessor()
    {
        desktop->setProcessor("HP Processor");
    }
};
class DesktopDirector
{
private:
    DesktopBuilder *desktopBuilder;

public:
    DesktopDirector(DesktopBuilder *pDesktopBuilder)
    {
        desktopBuilder = pDesktopBuilder;
    }
    Desktop *BuildDesktop()
    {
        desktopBuilder->buildMoniter();
        desktopBuilder->buildKeyboard();
        desktopBuilder->buildMotherboard();
        desktopBuilder->buildProcessor();
        desktopBuilder->buildSpeaker();
        desktopBuilder->buildMouse();
        desktopBuilder->buildRam();
        return desktopBuilder->getDesktop();
    }
};
int main()
{
    DellDesktopbuilder *DellDesktop = new DellDesktopbuilder();
    HPDesktopbuilder *HPDesktop = new HPDesktopbuilder();
    DesktopDirector *director1 = new DesktopDirector(DellDesktop);
    DesktopDirector *director2 = new DesktopDirector(HPDesktop);
    Desktop *desktop1 = director1->BuildDesktop();
    Desktop *desktop2 = director2->BuildDesktop();
    desktop1->showspecs();
    desktop2->showspecs();
    return 0;
}