package ua.bot.structure.adapter;

/**
 * The Target interface defines the domain-specific interface that Client uses.
 * This is the interface that clients expect to work with.
 */
public interface Target {
    
    /**
     * A request method defined by the Target interface.
     * This is the method that clients will call.
     * 
     * @return result of the request operation
     */
    String request();
}
