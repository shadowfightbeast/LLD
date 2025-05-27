public class MyThread2 extends Thread {
    @Override
    public void run() {

        try {
            Thread.sleep(100);
            System.out.println("Thread is running");
            while (true) {
                System.out.println("HEllo");
            }
            // Thread.yield(); //it's mean that we are saying that giving next thread chance
        }

        catch (InterruptedException e) {
            System.out.println("Thread interrupted. . " + e);
        }
    }

    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        // t1.setDaemon(true); //daemon means it is bg running process when main code finish it stopped by jvm  
        t1.start();
        // t1.interrupt(); //interrupt thread
        System.out.println("Main Done");
    }
}
