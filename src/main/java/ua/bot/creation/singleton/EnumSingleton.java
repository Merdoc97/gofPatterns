package ua.bot.creation.singleton;

/**
 * An implementation of the Singleton pattern using an enum.
 * This approach is the simplest and most effective way to implement a singleton in Java.
 * It provides serialization safety and thread-safety guaranteed by the enum implementation.
 */
public enum EnumSingleton {
    
    // The single instance of the enum
    INSTANCE;
    
    /**
     * Example business method of the singleton.
     */
    public void operation() {
        System.out.println("EnumSingleton: Performing operation");
    }
}
