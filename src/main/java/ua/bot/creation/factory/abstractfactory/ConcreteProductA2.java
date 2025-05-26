package ua.bot.creation.factory.abstractfactory;

/**
 * ConcreteProductA2 is another specific implementation of ProductA.
 * All products from the same family should have similar implementations.
 */
public class ConcreteProductA2 implements ProductA {
    
    /**
     * Implements the operation defined in the ProductA interface.
     */
    @Override
    public void operationA() {
        System.out.println("ConcreteProductA2: Performing operation A");
    }
}
