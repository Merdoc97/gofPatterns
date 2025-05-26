package ua.bot.creation.singleton;

/**
 * A basic implementation of the Singleton pattern using lazy initialization.
 * The instance is created only when the getInstance method is called for the first time.
 * 
 * Note: This implementation is not thread-safe.
 */
public class LazySingleton {
    
    // The private static instance of the singleton
    private static LazySingleton instance;
    
    /**
     * Private constructor to prevent instantiation from outside.
     */
    private LazySingleton() {
        // Private constructor to prevent instantiation
        System.out.println("LazySingleton: Creating instance");
    }
    
    /**
     * The static method to get the singleton instance.
     * Creates the instance on first call.
     * 
     * @return the singleton instance
     */
    public static LazySingleton getInstance() {
        // Lazy initialization: create instance only when needed
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
    
    /**
     * Example business method of the singleton.
     */
    public void operation() {
        System.out.println("LazySingleton: Performing operation");
    }
}
