package ua.bot.behaviour.observer;

/**
 * The Observer interface declares the update method, which is called
 * when the subject's state changes.
 */
public interface Observer {
    
    /**
     * Update method is called when the subject's state changes.
     *
     * @param subject the subject that has changed
     */
    void update(Subject subject);
    
    /**
     * Gets the name of this observer.
     *
     * @return the observer name
     */
    String getName();
}
