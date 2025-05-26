package ua.bot.structure.decorator;

/**
 * ConcreteDecoratorA extends the Decorator class to add specific functionality.
 * This decorator adds a prefix to the component's operation result.
 */
public class ConcreteDecoratorA extends Decorator {
    
    /**
     * Constructor that sets the component to be decorated.
     * 
     * @param component the component to decorate
     */
    public ConcreteDecoratorA(Component component) {
        super(component);
    }
    
    /**
     * Adds behavior by prefixing the component's operation result.
     * 
     * @return the enhanced result with additional behavior
     */
    @Override
    public String operation() {
        return "ConcreteDecoratorA(" + super.operation() + ")";
    }
    
    /**
     * An additional method specific to this decorator.
     * This demonstrates that decorators can add new methods,
     * though clients can only access these if they specifically
     * reference this decorator type.
     * 
     * @return a string representing additional functionality
     */
    public String additionalOperation() {
        return "Additional functionality from ConcreteDecoratorA";
    }
}
