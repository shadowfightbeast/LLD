#include <bits/stdc++.h>
using namespace std;
// factory design pattern  was creating concrete classes or  object
// abstract factory  design  pattern is going to  create factories that is going to create object

class Ibutton
{
public:
    virtual void press() = 0;
};
class Macbutton : public Ibutton
{
public:
    void press()
    {
        cout << "mac button pressed" << endl;
    }
};
class WinButton : public Ibutton
{
public:
    void press()
    {
        cout << "Window button pressed" << endl;
    }
};
class ITextBox
{
public:
    virtual void showtext() = 0;
};
class MacTextBox : public ITextBox
{
public:
    void showtext()
    {
        cout << " showing mac showtext box" << endl;
    }
};
class WinTextBox : public ITextBox
{
public:
    void showtext()
    {
        cout << "showing window showtext box" << endl;
    }
};
class Ifactory
{
public:
    virtual Ibutton *CreateButton() = 0;
    virtual ITextBox *CreateTextBox() = 0;
};
class MacFactory : public Ifactory
{
public:
    Ibutton *CreateButton()
    {
        return new Macbutton();
    }
    ITextBox *CreateTextBox()
    {
        return new MacTextBox();
    }
};
class WinFactory : public Ifactory
{
public:
    Ibutton *CreateButton()
    {
        return new WinButton();
    }
    ITextBox *CreateTextBox()
    {
        return new WinTextBox();
    }
};
class GUIAbstractFactory
{
public:
    static Ifactory *CreateFactory(string osType)
    {
        if (osType == "windows")
        {
            return new WinFactory();
        }
        else if (osType == "mac")
        {
            return new MacFactory();
        }
        return new MacFactory();
    }
};
int main()
{
    cout << "enter your machine os" << endl;
    string osType;
    cin >> osType;
    Ifactory *fact = GUIAbstractFactory::CreateFactory(osType);
    Ibutton *button = fact->CreateButton();
    button->press();

    ITextBox *textbox = fact->CreateTextBox();
    textbox->showtext();

    return 0;
}