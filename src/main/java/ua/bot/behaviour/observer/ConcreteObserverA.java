package ua.bot.behaviour.observer;

/**
 * ConcreteObserverA implements the Observer interface to receive and
 * respond to notifications from the subject.
 */
public class ConcreteObserverA implements Observer {
    
    private String observerState;
    private final String name;
    
    /**
     * Constructor initializes the observer with a name.
     *
     * @param name the name of this observer
     */
    public ConcreteObserverA(String name) {
        this.name = name;
    }
    
    /**
     * Updates the observer's state when notified by the subject.
     *
     * @param subject the subject that has changed
     */
    @Override
    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject) {
            ConcreteSubject concreteSubject = (ConcreteSubject) subject;
            observerState = concreteSubject.getState();
            System.out.println(name + ": Updated state to: " + observerState);
            
            // Observer A specific reaction
            System.out.println(name + ": Performing Observer A specific reaction to state change");
        }
    }
    
    /**
     * Gets the name of this observer.
     *
     * @return the observer name
     */
    @Override
    public String getName() {
        return name;
    }
    
    /**
     * Gets the observer's state.
     *
     * @return the observer's state
     */
    public String getObserverState() {
        return observerState;
    }
}
