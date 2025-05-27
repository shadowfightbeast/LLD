import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class BackAccount {
    private int balance = 100;

    // fairness in ReentrantLock lock if we pass ReentrantLock(true) then os
    // lock and release in fair manner for every thread
    private final Lock lock = new ReentrantLock();

    // public synchronized void withdraw(int amount) {
    // System.out.println(Thread.currentThread().getName() + "withdrawing start" +
    // balance);
    // if (balance >= amount) {
    // try {
    // Thread.sleep(3000);
    // } catch (Exception e) {

    // }

    // balance -= amount;
    // System.out.println(Thread.currentThread().getName() + "balance after
    // withdraw" + balance);
    // }
    // }

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + "attempting to withdraw" + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "withdrawing process started");
                        balance -= amount;
                        Thread.sleep(2000);
                        System.out.println(Thread.currentThread().getName()
                                + "withdrawing process completed and balance is " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                        System.out.println(Thread.currentThread().getName() + "");
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + "insufficient  balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + "could not acquire the lock");
            }
        } catch (Exception e) {
            System.out.println(e);
            Thread.currentThread().interrupt();
        }
        if (Thread.currentThread().isInterrupted()) {
            // System.out.println(Thread.currentThread().getClass());
        }
    }
}
