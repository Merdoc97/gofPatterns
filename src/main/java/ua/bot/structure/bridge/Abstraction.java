package ua.bot.structure.bridge;

/**
 * The Abstraction defines the abstraction's interface and maintains a reference
 * to an object of type Implementor. The Abstraction delegates the implementation
 * details to this Implementor object.
 */
public abstract class Abstraction {
    
    /**
     * Reference to the implementor.
     */
    protected Implementor implementor;
    
    /**
     * Constructor that sets the implementor.
     * 
     * @param implementor the implementor to use
     */
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    
    /**
     * The operation that uses the implementor.
     * This method can be implemented in the Abstraction class if it doesn't need
     * to be customized by subclasses.
     */
    public void operation() {
        implementor.operationImpl();
    }
}
