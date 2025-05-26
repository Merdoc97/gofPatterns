package ua.bot.creation.factory;

/**
 * ConcreteProductA is a specific implementation of the Product interface.
 */
public class ConcreteProductA implements Product {
    
    /**
     * Implements the operation defined in the Product interface.
     */
    @Override
    public void operation() {
        System.out.println("ConcreteProductA: Performing operation specific to Product A");
    }
    
    /**
     * Returns the product name.
     * 
     * @return the name of the product
     */
    @Override
    public String getName() {
        return "Product A";
    }
}
