package ua.bot.structure.bridge;

/**
 * ConcreteImplementorB is another specific implementation of the Implementor interface.
 */
public class ConcreteImplementorB implements Implementor {
    
    /**
     * Implements the operation in a way specific to ConcreteImplementorB.
     */
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorB: Operation implemented in ConcreteImplementorB");
    }
}
