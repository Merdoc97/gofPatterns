package ua.bot.creation.factory.abstractfactory;

/**
 * The ProductB interface declares the operations that all concrete ProductB
 * variants must implement.
 */
public interface ProductB {
    
    /**
     * An operation specific to ProductB.
     */
    void operationB();
    
    /**
     * ProductB can also collaborate with ProductA.
     * Abstract Factory ensures that all products it creates are compatible.
     * 
     * @param productA the ProductA to collaborate with
     */
    void collaborateWith(ProductA productA);
}
