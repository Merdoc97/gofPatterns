package ua.bot.behaviour.state;

/**
 * ConcreteStateC implements state-specific behavior for State C.
 * It also defines the transition back to the first state.
 */
public class ConcreteStateC implements State {
    
    /**
     * Handles the request and transitions to the next state.
     * 
     * @param context the context to handle and transition
     */
    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateC: Handling request and changing back to State A");
        
        // State-specific behavior
        System.out.println("ConcreteStateC: Performing State C specific operation");
        
        // Transition back to State A (completing the cycle)
        context.setState(new ConcreteStateA());
    }
    
    /**
     * Returns the name of this state.
     * 
     * @return the name of this state
     */
    @Override
    public String getName() {
        return "State C";
    }
}
