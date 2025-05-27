class SharedResources {
    private int data;
    private boolean hasData;

    // Thread Safety:
    //
    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced" + value);
        notify();
    }

    public synchronized int consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("consumed" + data);
        notify();
        return data;

    }
}

class Producer implements Runnable {
    private SharedResources resource;

    public Producer(SharedResources resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.produce(i);
            System.out.println("Produced" + i);
        }
    }
}

class Consumer implements Runnable {
    private SharedResources resource;

    public Consumer(SharedResources resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = resource.consume();
            System.out.println("conusmer" + value);
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        System.out.println("12");
        SharedResources resource = new SharedResources();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }

}
