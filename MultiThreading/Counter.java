package MultiThreading;

public class Counter {
    private int count = 0;

    // public void increment() {
    // in this function is not synchronized but only that block part of this
    // function is synchronized
    // synchronized (this) {
    // count++;
    // }
    // }

    // synchronized means if multiple thread use the one object then call one method
    // then synchronized make sure it is used by one thread in one time

    // Q.how to handle with race condition .
    // Ans-"Race conditions can be handled using synchronization techniques such as
    // mutual exclusion, which ensures that only one thread or process accesses
    // shared resources at a time.
    // mutual exclusion make ensure that multiple thread simultaneously cannot
    // access the critical section
    public synchronized void increment() {

        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {

        Counter counter = new Counter();
        counter.increment();
        counter.increment();

        System.out.println(counter.getCount()); // Access count via getter
    }
}
