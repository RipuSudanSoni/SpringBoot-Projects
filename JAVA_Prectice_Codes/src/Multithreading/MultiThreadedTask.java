package Multithreading;

public class MultiThreadedTask implements Runnable {
    private final int id;

    public MultiThreadedTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + id + " : " + i);
        }
    }

    public static void main(String[] args) {
        int numThreads = 3;

        // create threads and start them
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new MultiThreadedTask(i));
            threads[i].start();
        }

        // wait for threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All threads finished.");
    }
}
