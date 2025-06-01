package MultiThreading;

class One {
    public static void main(String[] args) {
        // System.out.println("Hello, Java!");
        // System.out.println(Thread.currentThread().getName());
        World world = new World();
        // world.start();
        Thread t1 = new Thread(world);
        t1.start();
        // t1.join();

        // for (int i = 0; i < 1000; i++) {
        // System.out.println("hello");
        // }
    }

}
