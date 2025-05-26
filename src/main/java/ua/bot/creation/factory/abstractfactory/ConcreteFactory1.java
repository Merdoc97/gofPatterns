package ua.bot.creation.factory.abstractfactory;

/**
 * ConcreteFactory1 produces a family of products belonging to a single variant.
 * This factory guarantees that the products it creates are compatible.
 */
public class ConcreteFactory1 implements AbstractFactory {
    
    /**
     * Creates and returns the first variant of ProductA.
     * 
     * @return an instance of ConcreteProductA1
     */
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }
    
    /**
     * Creates and returns the first variant of ProductB.
     * 
     * @return an instance of ConcreteProductB1
     */
    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
