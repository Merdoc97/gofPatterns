package ua.bot.structure.decorator;

/**
 * ConcreteDecoratorC extends the Decorator class to add functionality
 * that wraps the component's operation result in parentheses.
 */
public class ConcreteDecoratorC extends Decorator {
    
    /**
     * State specific to this decorator
     */
    private final String additionalState;
    
    /**
     * Constructor that sets the component to be decorated
     * and initializes additional state.
     * 
     * @param component the component to decorate
     */
    public ConcreteDecoratorC(Component component) {
        super(component);
        this.additionalState = "Important State";
    }
    
    /**
     * Adds behavior by wrapping the component's operation result
     * in brackets and adding the decorator's state.
     * 
     * @return the enhanced result with additional behavior
     */
    @Override
    public String operation() {
        return "[" + super.operation() + "] with " + additionalState;
    }
}
