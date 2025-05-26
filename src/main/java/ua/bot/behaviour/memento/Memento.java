package ua.bot.behaviour.memento;

/**
 * The Memento class stores the internal state of the Originator object.
 * The memento may store as much or as little of the originator's internal
 * state as necessary at its originator's discretion.
 * The Memento protects against access by objects other than the originator.
 */
public class Memento {
    
    private final String state;
    
    /**
     * Constructor takes the state to be saved in the memento.
     * 
     * @param state the state to save
     */
    public Memento(String state) {
        this.state = state;
    }
    
    /**
     * Returns the state stored in the memento.
     * This method is accessible only to the originator.
     * 
     * @return the saved state
     */
    protected String getState() {
        return state;
    }
}
