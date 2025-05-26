package ua.bot.behaviour.mediator;

/**
 * The Mediator interface defines the communication method that concrete mediators must implement.
 * This interface acts as a contract for handling communication between colleagues.
 */
public interface Mediator {
    
    /**
     * Notifies the mediator about an event that occurred in a colleague.
     * The mediator then decides which colleagues to notify based on the event.
     * 
     * @param sender the colleague that triggered the event
     * @param event the event that occurred
     */
    void notify(Colleague sender, String event);
}
