package ua.bot.creation.factory.abstractfactory;

/**
 * ConcreteProductA1 is a specific implementation of ProductA.
 * All products from the same family should have similar implementations.
 */
public class ConcreteProductA1 implements ProductA {
    
    /**
     * Implements the operation defined in the ProductA interface.
     */
    @Override
    public void operationA() {
        System.out.println("ConcreteProductA1: Performing operation A");
    }
}
