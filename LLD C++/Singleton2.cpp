#include <bits/stdc++.h>
#include <thread>
#include <mutex>
using namespace std;

//Singleton is a creational design pattern that lets you ensure that a class has only one instance, 
// while providing a global access point to this instance.

// for multiple instance
// class Logger {
//     static int ctr;
//     static Logger* loggerInstance;
//     static mutex mtx;
// private:
//     static Singleton* pinstance_;
//     static std::mutex mutex_;
//     Logger() {
//         ctr++;
//         cout << "new instance created.NO of instances are" << ctr << endl;
//     }

// public:
//     static Logger* gelogger() {
//         mtx.lock();
//         if (loggerInstance == nullptr) {
//             loggerInstance = new Logger();
//         }
//         mtx.unlock();
//         return loggerInstance;
//     }
//     void Log(string msg) {
//         cout << msg << endl;
//     }
// };
// Logger* Logger::loggerinstance = nullptr;
// int Logger::ctr = 0;
// mutex Logger::mtx;
// void userLogs() {
//     Logger* logger1 = Logger::gelogger();
//     logger1->Log("this is msg  from the user 1");
// }
// void user2Logs() {
//     Logger* logger2 = Logger::gelogger();
//     logger2->Log("this is msg  from the user 2");
// }
// int main() {
//     thread t1(userLogs);
//     thread t2(user2Logs);
//     t1.join();
//     t2.join();
//     return 0;
// }

