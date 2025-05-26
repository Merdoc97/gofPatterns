package ua.bot.behaviour.memento;

/**
 * The Originator is the object whose state we want to save and restore.
 * It creates a memento containing a snapshot of its current internal state
 * and uses the memento to restore its internal state.
 */
public class Originator {
    
    private String state;
    
    /**
     * Sets the state of the originator.
     * 
     * @param state the new state
     */
    public void setState(String state) {
        this.state = state;
        System.out.println("Originator: Setting state to " + state);
    }
    
    /**
     * Gets the current state of the originator.
     * 
     * @return the current state
     */
    public String getState() {
        return state;
    }
    
    /**
     * Saves the current state inside a memento.
     * 
     * @return a new memento with the current state
     */
    public Memento saveStateToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(state);
    }
    
    /**
     * Restores the originator's state from a memento.
     * 
     * @param memento the memento containing the state to restore
     */
    public void restoreStateFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }
}
