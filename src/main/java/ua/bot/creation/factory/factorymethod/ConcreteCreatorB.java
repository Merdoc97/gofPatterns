package ua.bot.creation.factory.factorymethod;

import ua.bot.creation.factory.ConcreteProductB;
import ua.bot.creation.factory.Product;

/**
 * ConcreteCreatorB is another concrete implementation of the Creator interface.
 * It overrides the factory method to return an instance of ConcreteProductB.
 */
public class ConcreteCreatorB implements Creator {
    
    /**
     * Factory method implementation that creates and returns a ConcreteProductB instance.
     * 
     * @return a new ConcreteProductB instance
     */
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
