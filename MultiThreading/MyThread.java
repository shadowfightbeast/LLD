package MultiThreading;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(
                    Thread.currentThread().getName() + "-Priority " + Thread.currentThread().getPriority() + " -count-"
                            + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread l = new MyThread("LP");
        MyThread m = new MyThread("MP");
        MyThread h = new MyThread("HP");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        l.interrupt();
        m.start();
        h.start();
    }
}
