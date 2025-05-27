public class VolatileExample extends Thread {
    private static volatile boolean flag = false;

    public void run() {
        while (!flag) {
            // wait until flag becomes true
        }
        System.out.println("Thread detected flag change!");
    }

    public static void main(String[] args) throws InterruptedException {
        new VolatileExample().start();
        Thread.sleep(1000);
        flag = true; // This change is visible to the other thread
        System.out.println("Flag set to true");
    }
}
