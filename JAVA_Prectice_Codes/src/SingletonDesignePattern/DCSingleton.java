package SingletonDesignePattern;

public class DCSingleton {
    private static volatile DCSingleton instance;

    private DCSingleton() {
        // Private constructor to prevent instantiation
    }

    public static DCSingleton getInstance() {
        if (instance == null) {  // Check 1 - First null check without acquiring lock
            synchronized (DCSingleton.class) {
                if (instance == null) {  // Check 2 - Second null check within synchronized block
                    instance = new DCSingleton();
                }
            }
        }
        return instance;
    }

    // Other methods of the Singleton class
    public void showMessage() {
        System.out.println("Hello, I am a thread-safe singleton!");
    }
}

