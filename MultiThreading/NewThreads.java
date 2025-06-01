package MultiThreading;

public class NewThreads extends Thread {

    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // System.out.println(i);
    }

    public static void main(String[] args) throws InterruptedException {
        NewThreads t1 = new NewThreads();
        t1.start();
        t1.join();
        System.out.println("Hello");
    }
}
