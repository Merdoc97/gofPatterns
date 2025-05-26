package ua.bot.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteSubject implements the Subject interface.
 * It maintains a list of observers and notifies them of state changes.
 */
public class ConcreteSubject implements Subject {
    
    private final List<Observer> observers = new ArrayList<>();
    private String state;
    
    /**
     * Attaches an observer to this subject.
     *
     * @param observer the observer to attach
     */
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println("Subject: Attached an observer");
    }
    
    /**
     * Detaches an observer from this subject.
     *
     * @param observer the observer to detach
     */
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
        System.out.println("Subject: Detached an observer");
    }
    
    /**
     * Notifies all attached observers of a state change.
     */
    @Override
    public void notifyObservers() {
        System.out.println("Subject: Notifying observers...");
        
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
    
    /**
     * Gets the current state.
     *
     * @return the current state
     */
    public String getState() {
        return state;
    }
    
    /**
     * Sets a new state and notifies observers if the state changes.
     *
     * @param state the new state
     */
    public void setState(String state) {
        if (this.state == null || !this.state.equals(state)) {
            this.state = state;
            System.out.println("Subject: State changed to: " + state);
            notifyObservers();
        } else {
            System.out.println("Subject: State unchanged, not notifying observers");
        }
    }
}
