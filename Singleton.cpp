#include <bits/stdc++.h>
using namespace std;
// make all constructor of the class private
//  delete the copy  constructo of the class
// Make a private static pointer that can point to the same class object (singleton class).
// Make a public static method that returns the pointer to the same class object (singleton class)
// 1.creating for a single instance which we will  use for all the users
class Logger
{
    static int ctr;
    static Logger *LoggerInstance;
    Logger()
    {
        ctr++;
        cout << "new instance created.no of instances are" << ctr << endl;
    }

public:
    static Logger *getLogger()
    {
        if (LoggerInstance == NULL)
        {
            LoggerInstance = new Logger();
        }
        return LoggerInstance;
    }
    void Log(string msg)
    {

        cout << msg << endl;
    }
};
Logger *Logger::LoggerInstance = NULL;
int Logger::ctr = 0;
int main()
{
    Logger *logger = Logger::getLogger();
    logger->Log("this msg from ther user 1");

    Logger *logger2 = Logger::getLogger();
    logger2->Log("this msg from ther user 2");
    return 0;
}