public class LambdaExp {
    public static void main(String[] args) {
        // Runnable runnable = () -> {
        // System.out.println("hello");
        // };
        // Thread t1 = new Thread(runnable);
        // t1.start();
        Thread t1 = new Thread(() -> System.out.println("hello"));
        t1.start();
    }
}
