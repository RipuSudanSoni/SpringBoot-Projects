package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizedExample {
//    private int count = 0;
	private static AtomicInteger count = new AtomicInteger(0);

    public int incrementCount() {
        synchronized (this) {
           return count.incrementAndGet();
        }
    }

//    public int getCount() {
//        synchronized (this) {
//            return count;
//        }
//    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample synchronizedExample = new SynchronizedExample();

        // create and start multiple threads to increment the count
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 20; j++) {
                    synchronizedExample.incrementCount();
                }
            });
            threads[i].start();
        }

        // wait for threads to finish
        for (Thread thread : threads) {
            thread.join();
        }

        // print final count
        System.out.println("Final count: " + synchronizedExample.incrementCount());
    }
}
