package ua.bot.structure.decorator;

/**
 * ConcreteDecoratorB extends the Decorator class to add different functionality.
 * This decorator adds a suffix to the component's operation result.
 */
public class ConcreteDecoratorB extends Decorator {
    
    /**
     * Constructor that sets the component to be decorated.
     * 
     * @param component the component to decorate
     */
    public ConcreteDecoratorB(Component component) {
        super(component);
    }
    
    /**
     * Adds behavior by suffixing the component's operation result
     * and also adding some state (represented by the number here).
     * 
     * @return the enhanced result with additional behavior
     */
    @Override
    public String operation() {
        return super.operation() + " + ConcreteDecoratorB";
    }
    
    /**
     * An additional behavior that adds a new feature.
     * This demonstrates that decorators can perform extra
     * actions before or after calling the wrapped methods.
     */
    public void newFeature() {
        System.out.println("New feature from ConcreteDecoratorB");
    }
}
