
public class ExplicitLock {
    public static void main(String[] args) {
        BackAccount sbi = new BackAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };
        Thread t1 = new Thread(task, "thread 1");
        Thread t2 = new Thread(task, "thread 2");
        t1.start();
        t2.start();
    }
}
