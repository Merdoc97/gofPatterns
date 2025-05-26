package ua.bot.creation.factory.abstractfactory;

/**
 * The Client works with factories and products only through abstract interfaces.
 * This lets the client work with any factory or product subclasses.
 */
public class Client {
    
    private ProductA productA;
    private ProductB productB;
    
    /**
     * The client accepts an abstract factory in the constructor.
     * 
     * @param factory abstract factory to use for creating products
     */
    public Client(AbstractFactory factory) {
        productA = factory.createProductA();
        productB = factory.createProductB();
    }
    
    /**
     * The client uses the products created by the factory.
     */
    public void executeOperations() {
        productA.operationA();
        productB.operationB();
        productB.collaborateWith(productA);
    }
}
