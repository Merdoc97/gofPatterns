package ua.bot.behaviour.state;

/**
 * The Context defines the interface of interest to clients.
 * It maintains a reference to a State object that defines the current state.
 */
public class Context {
    
    private State state;
    
    /**
     * Constructor initializes the context with a default state.
     * 
     * @param initialState the initial state
     */
    public Context(State initialState) {
        this.state = initialState;
        System.out.println("Context: Initial state is " + state.getName());
    }
    
    /**
     * Sets the current state.
     * 
     * @param state the new state
     */
    public void setState(State state) {
        System.out.println("Context: Changing state to " + state.getName());
        this.state = state;
    }
    
    /**
     * Gets the current state.
     * 
     * @return the current state
     */
    public State getState() {
        return state;
    }
    
    /**
     * Request method delegates the state-specific behavior to the current state.
     */
    public void request() {
        System.out.println("Context: Delegating request to " + state.getName());
        state.handle(this);
    }
}
