package Multithreading;

public class ParallelTaskExample {
    public static void main(String[] args) throws InterruptedException {
        // create and start multiple threads
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                // perform the task
                for (int j = 0; j < 10; j++) {
                    System.out.println("Thread " + Thread.currentThread().getId() + ": Task " + j);
                }
            });
            threads[i].start();
        }

        // wait for threads to finish
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("All threads finished.");
    }
}
