package ua.bot.creation.factory.abstractfactory;

/**
 * ConcreteFactory2 produces a family of products belonging to a different variant.
 * This factory also guarantees that the products it creates are compatible.
 */
public class ConcreteFactory2 implements AbstractFactory {
    
    /**
     * Creates and returns the second variant of ProductA.
     * 
     * @return an instance of ConcreteProductA2
     */
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }
    
    /**
     * Creates and returns the second variant of ProductB.
     * 
     * @return an instance of ConcreteProductB2
     */
    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
