package ua.bot.creation.factory;

/**
 * The Product interface declares the operations that all concrete products must implement.
 */
public interface Product {
    
    /**
     * An operation that all concrete products must implement.
     */
    void operation();
    
    /**
     * Returns the product name for identification.
     * 
     * @return the name of the product
     */
    String getName();
}
