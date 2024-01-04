package Eclipse_testing.testwhoo;

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(new CounterRunnable(counter));
        Thread t2 = new Thread(new CounterRunnable(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}


