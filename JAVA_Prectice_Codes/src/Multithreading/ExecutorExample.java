package Multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        // Create an executor with a fixed thread pool
        Executor executor = Executors.newFixedThreadPool(10);

        // Submit tasks to the executor
        for (int i = 0; i < 100; i++) {
            executor.execute(new Task(i));
        }
    }

    private static class Task implements Runnable {
        private int taskId;

        public Task(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            // Perform the task asynchronously
            System.out.println("Task " + taskId + " started");
          
            System.out.println("Task " + taskId + " finished");
        }
    }
}

