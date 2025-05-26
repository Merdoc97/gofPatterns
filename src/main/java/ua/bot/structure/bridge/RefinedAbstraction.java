package ua.bot.structure.bridge;

/**
 * RefinedAbstraction extends the interface defined by Abstraction.
 * It can add additional functionality or refine the basic operation.
 */
public class RefinedAbstraction extends Abstraction {
    
    /**
     * Constructor that sets the implementor.
     * 
     * @param implementor the implementor to use
     */
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }
    
    /**
     * Extends or refines the basic operation defined in Abstraction.
     * This demonstrates how RefinedAbstraction can provide enhanced functionality
     * while still delegating the implementation details to the Implementor.
     */
    @Override
    public void operation() {
        System.out.println("RefinedAbstraction: Extended operation start");
        super.operation();
        System.out.println("RefinedAbstraction: Extended operation end");
    }
    
    /**
     * Adds a new operation not found in the base Abstraction.
     * This demonstrates how RefinedAbstraction can provide additional functionality.
     */
    public void additionalOperation() {
        System.out.println("RefinedAbstraction: Additional operation start");
        implementor.operationImpl();
        System.out.println("RefinedAbstraction: Additional operation end");
    }
}
