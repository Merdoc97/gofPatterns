package ua.bot.creation.factory;

/**
 * ConcreteProductB is another specific implementation of the Product interface.
 */
public class ConcreteProductB implements Product {
    
    /**
     * Implements the operation defined in the Product interface.
     */
    @Override
    public void operation() {
        System.out.println("ConcreteProductB: Performing operation specific to Product B");
    }
    
    /**
     * Returns the product name.
     * 
     * @return the name of the product
     */
    @Override
    public String getName() {
        return "Product B";
    }
}
