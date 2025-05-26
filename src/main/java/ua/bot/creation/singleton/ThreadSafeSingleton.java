package ua.bot.creation.singleton;

/**
 * A thread-safe implementation of the Singleton pattern using double-checked locking.
 * This implementation ensures that only one instance is created even in a multi-threaded environment.
 */
public class ThreadSafeSingleton {
    
    // The private static volatile instance of the singleton
    private static volatile ThreadSafeSingleton instance;
    
    /**
     * Private constructor to prevent instantiation from outside.
     */
    private ThreadSafeSingleton() {
        // Private constructor to prevent instantiation
        System.out.println("ThreadSafeSingleton: Creating instance");
    }
    
    /**
     * The static method to get the singleton instance.
     * Uses double-checked locking for thread safety.
     * 
     * @return the singleton instance
     */
    public static ThreadSafeSingleton getInstance() {
        // First check (without synchronization)
        if (instance == null) {
            // Synchronize on the class object
            synchronized (ThreadSafeSingleton.class) {
                // Second check (with synchronization)
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
    
    /**
     * Example business method of the singleton.
     */
    public void operation() {
        System.out.println("ThreadSafeSingleton: Performing operation");
    }
}
