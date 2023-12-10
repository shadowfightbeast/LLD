#include <bits/stdc++.h>
using namespace std;
// just define one-to-one dependency so that when one object changes states
class IsSubscriber {
public:
    virtual void notify(string msg) = 0;
};
class user : public IsSubscriber {
private:
    int userId;

public:
    user(int userid) {
        this->userId = userid;
    }
    void notify(string msg) {
        cout << "user" << userId << " " << msg << endl;
    }
};
class Group
{
private:
    list<IsSubscriber*> users;

public:
    void subscribe(IsSubscriber* user) {
        users.push_back(user);
    }
    void unsubscribe(IsSubscriber* user) {
        users.remove(user);
    }
    void notify(string msg) {
        for (auto it : users)
        {
            it->notify(msg);
        }
    }
};
int main() {
    Group* group = new Group;
    user* user1 = new user(1);
    user* user2 = new user(2);
    user* user3 = new user(3);

    group->subscribe(user1);
    group->subscribe(user2);
    group->subscribe(user3);
    group->notify("new msg");
    group->unsubscribe(user1);
    group->unsubscribe(user1);
    group->notify("new new message");
    return 0;
}