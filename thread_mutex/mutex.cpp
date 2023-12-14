#include <iostream> 
#include <thread> 
#include <mutex> 
using namespace std;


// Mutex stands for Mutual Exclusion. In C++, std::mutex class is a synchronization primitive that is used to protect the shared data from being accessed by multiple threads simultaneously.
//  The shared data can be in the form of variables, data structures, etc

mutex mtx;// Create object for mutex 

int number = 0;// Shared resource 

// function to increment the number 
void increment() {
    // Lock the thread using lock 
    mtx.lock();

    // increment number by 1 for 1000000 times 
    for (int i = 0; i < 1000000; i++) {
        number++;
    }
    // Release the lock using unlock() 
    mtx.unlock();
}

int main()
{
    // Create thread t1 to perform increment() 
    thread t1(increment);

    // Create thread t2 to perform increment() 
    thread t2(increment);

    // Start both threads simultaneously 
    t1.join();
    t2.join();

    // Print the number after the execution of both threads 
    cout << "Number after execution of t1 and t2 is " << number;

    return 0;
}
