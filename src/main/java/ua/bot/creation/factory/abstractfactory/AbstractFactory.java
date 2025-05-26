package ua.bot.creation.factory.abstractfactory;

/**
 * The Abstract Factory interface declares creation methods for each distinct
 * product type. Different concrete factories implement these methods to produce
 * different variants of products.
 */
public interface AbstractFactory {
    
    /**
     * Creates ProductA variant.
     * 
     * @return an instance of ProductA
     */
    ProductA createProductA();
    
    /**
     * Creates ProductB variant.
     * 
     * @return an instance of ProductB
     */
    ProductB createProductB();
}
