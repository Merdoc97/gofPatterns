package ua.bot.behaviour.state;

/**
 * ConcreteStateB implements state-specific behavior for State B.
 * It also defines the transition to the next state.
 */
public class ConcreteStateB implements State {
    
    /**
     * Handles the request and transitions to the next state.
     * 
     * @param context the context to handle and transition
     */
    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateB: Handling request and changing to State C");
        
        // State-specific behavior
        System.out.println("ConcreteStateB: Performing State B specific operation");
        
        // Transition to State C
        context.setState(new ConcreteStateC());
    }
    
    /**
     * Returns the name of this state.
     * 
     * @return the name of this state
     */
    @Override
    public String getName() {
        return "State B";
    }
}
