package ua.bot.creation.factory.factorymethod;

import ua.bot.creation.factory.ConcreteProductA;
import ua.bot.creation.factory.Product;

/**
 * ConcreteCreatorA is a concrete implementation of the Creator interface.
 * It overrides the factory method to return an instance of ConcreteProductA.
 */
public class ConcreteCreatorA implements Creator {
    
    /**
     * Factory method implementation that creates and returns a ConcreteProductA instance.
     * 
     * @return a new ConcreteProductA instance
     */
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
