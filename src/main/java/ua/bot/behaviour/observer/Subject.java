package ua.bot.behaviour.observer;

/**
 * The Subject interface defines methods for attaching, detaching, 
 * and notifying observers.
 */
public interface Subject {
    
    /**
     * Attaches an observer to the subject.
     *
     * @param observer the observer to attach
     */
    void attach(Observer observer);
    
    /**
     * Detaches an observer from the subject.
     *
     * @param observer the observer to detach
     */
    void detach(Observer observer);
    
    /**
     * Notifies all attached observers when the subject's state changes.
     */
    void notifyObservers();
}
