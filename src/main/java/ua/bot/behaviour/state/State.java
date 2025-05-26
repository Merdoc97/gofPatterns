package ua.bot.behaviour.state;

/**
 * The State interface defines a common interface for all concrete states.
 * All states provide their implementation for the state-specific behavior.
 */
public interface State {
    
    /**
     * Handle a request from the context.
     * This method contains the state-specific behavior.
     * 
     * @param context the context that is in this state
     */
    void handle(Context context);
    
    /**
     * Returns the name of the state.
     * 
     * @return the name of this state
     */
    String getName();
}
