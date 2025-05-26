package ua.bot.behaviour.state;

/**
 * ConcreteStateA implements state-specific behavior for State A.
 * It also defines the transition to the next state.
 */
public class ConcreteStateA implements State {
    
    /**
     * Handles the request and transitions to the next state.
     * 
     * @param context the context to handle and transition
     */
    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateA: Handling request and changing to State B");
        
        // State-specific behavior
        System.out.println("ConcreteStateA: Performing State A specific operation");
        
        // Transition to State B
        context.setState(new ConcreteStateB());
    }
    
    /**
     * Returns the name of this state.
     * 
     * @return the name of this state
     */
    @Override
    public String getName() {
        return "State A";
    }
}
