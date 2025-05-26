package ua.bot.creation.builder;

/**
 * The Builder interface declares methods for creating different parts of a Product object.
 */
public interface Builder {
    
    /**
     * Reset the builder to clear any existing product.
     */
    void reset();
    
    /**
     * Build part A of the product.
     */
    void buildPartA();
    
    /**
     * Build part B of the product.
     */
    void buildPartB();
    
    /**
     * Build part C of the product.
     */
    void buildPartC();
    
    /**
     * Get the result of the building process.
     * 
     * @return the built product
     */
    Product getResult();
}
