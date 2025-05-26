package ua.bot.structure.bridge;

/**
 * ConcreteImplementorA is a specific implementation of the Implementor interface.
 */
public class ConcreteImplementorA implements Implementor {
    
    /**
     * Implements the operation in a way specific to ConcreteImplementorA.
     */
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorA: Operation implemented in ConcreteImplementorA");
    }
}
