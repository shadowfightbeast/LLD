#include <bits/stdc++.h>
using namespace std;
// factory design pattern  was creating concrete classes or  object
// Abstract factory  design  pattern is going to  create factories that is going to create object

class I_button {
public:
    virtual void press() = 0;
};

class Mac_button : public I_button {
public:
    void press() {
        cout << "mac button pressed" << endl;
    }
};
class WinButton : public I_button {
public:
    void press() {
        cout << "Window button pressed" << endl;
    }
};
class ITextBox {
public:
    virtual void show_text() = 0;
};
class MacTextBox : public ITextBox {
public:
    void show_text() {
        cout << " showing mac show_text box" << endl;
    }
};
class WinTextBox : public ITextBox {
public:
    void show_text() {
        cout << "showing window show_text box" << endl;
    }
};

class I_factory {
public:
    virtual I_button* CreateButton() = 0;
    virtual ITextBox* CreateTextBox() = 0;
};

class MacFactory : public I_factory {
public:
    I_button* CreateButton() {
        return new Mac_button();
    }
    ITextBox* CreateTextBox() {
        return new MacTextBox();
    }
};

class WinFactory : public I_factory {
public:
    I_button* CreateButton() {
        return new WinButton();
    }
    ITextBox* CreateTextBox() {
        return new WinTextBox();
    }
};
class GUIAbstractFactory {
public:
    static I_factory* CreateFactory(string osType) {
        if (osType == "windows")
            return new WinFactory();
        else if (osType == "mac")
            return new MacFactory();
        return new MacFactory();
    }
};
int main()
{
    cout << "enter your machine os" << endl;
    string osType;
    cin >> osType;
    I_factory* fact = GUIAbstractFactory::CreateFactory(osType);
    I_button* button = fact->CreateButton();
    button->press();

    ITextBox* text_box = fact->CreateTextBox();
    text_box->show_text();

    return 0;
}