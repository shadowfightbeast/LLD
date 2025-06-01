package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample extends Thread {
    private static AtomicInteger counter = new AtomicInteger(0);

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incrementAndGet(); // Atomic increment
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicExample t1 = new AtomicExample();
        AtomicExample t2 = new AtomicExample();

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.get()); // Always 2000
    }
}
