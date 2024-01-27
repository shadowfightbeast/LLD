#include <iostream>       
#include <thread>         
using namespace std;

//RUN CODE ON W3SCHOOL ONLINE COMPILER 
void foo() {
    cout << "this is foo method()" << endl;
}

void bar(int x)
{
    cout << "this is bar method()" << endl;
}

int main()
{
    std::thread first(foo);     // spawn new thread that calls foo()
    std::thread second(bar, 1);  // spawn new thread that calls bar(0)

    cout << "main, foo and bar now execute concurrently...\n";

    // synchronize threads:
    first.join();                // pauses until first finishes
    second.join();               // pauses until second finishes

    cout << "foo and bar completed.\n";

    return 0;
}