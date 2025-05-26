package ua.bot.structure.bridge;

/**
 * The Implementor interface defines the interface for implementation classes.
 * This interface doesn't need to correspond exactly to Abstraction's interface.
 * In most cases, Implementor provides primitive operations, while Abstraction
 * defines higher-level operations based on these primitives.
 */
public interface Implementor {
    
    /**
     * A primitive operation that concrete implementors must provide.
     */
    void operationImpl();
}
