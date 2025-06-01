package MultiThreading;

public class Threading extends Thread {
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Threading t1 = new Threading();
        System.out.println(t1.getState()); // NEW STATE
        t1.start();
        System.out.println(t1.getState()); // RUNNABLE STATE
        Thread.sleep(100);
        System.out.println(t1.getState()); // TIMED_WAITING STATE
        t1.join(); // this line wait to finish that thread then after code executed
        System.out.println(t1.getState()); // TERMINATED STATE
    }
}
