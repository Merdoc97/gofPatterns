package ua.bot.structure.decorator;

/**
 * The Decorator abstract class implements the Component interface
 * and contains a reference to a Component object.
 * This is the base class for all concrete decorators.
 */
public abstract class Decorator implements Component {
    
    /**
     * The wrapped component that the decorator adds behavior to.
     */
    protected Component component;
    
    /**
     * Constructor that sets the component to be decorated.
     * 
     * @param component the component to decorate
     */
    public Decorator(Component component) {
        this.component = component;
    }
    
    /**
     * Default implementation that delegates to the wrapped component.
     * Subclasses may override this to add additional behavior.
     * 
     * @return the result of the operation from the wrapped component
     */
    @Override
    public String operation() {
        return component.operation();
    }
}
