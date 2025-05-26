package ua.bot.creation.singleton;

/**
 * An implementation of the Singleton pattern using eager initialization.
 * The instance is created when the class is loaded, ensuring thread safety.
 */
public class EagerSingleton {
    
    // The private static instance of the singleton, eagerly initialized
    private static final EagerSingleton INSTANCE = new EagerSingleton();
    
    /**
     * Private constructor to prevent instantiation from outside.
     */
    private EagerSingleton() {
        // Private constructor to prevent instantiation
        System.out.println("EagerSingleton: Creating instance");
    }
    
    /**
     * The static method to get the singleton instance.
     * 
     * @return the singleton instance
     */
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
    
    /**
     * Example business method of the singleton.
     */
    public void operation() {
        System.out.println("EagerSingleton: Performing operation");
    }
}
