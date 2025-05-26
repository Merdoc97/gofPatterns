package ua.bot.creation.builder;

/**
 * ConcreteBuilder1 is a specific implementation of the Builder interface.
 * It creates and assembles parts of the product by implementing the Builder interface.
 */
public class ConcreteBuilder1 implements Builder {
    
    private Product product;
    
    /**
     * Constructor initializes a new Product instance.
     */
    public ConcreteBuilder1() {
        reset();
    }
    
    /**
     * Reset the builder to start with a new Product.
     */
    @Override
    public void reset() {
        product = new Product();
    }
    
    /**
     * Build part A with specific implementation for ConcreteBuilder1.
     */
    @Override
    public void buildPartA() {
        product.add("Part A (built by ConcreteBuilder1)");
    }
    
    /**
     * Build part B with specific implementation for ConcreteBuilder1.
     */
    @Override
    public void buildPartB() {
        product.add("Part B (built by ConcreteBuilder1)");
    }
    
    /**
     * Build part C with specific implementation for ConcreteBuilder1.
     */
    @Override
    public void buildPartC() {
        product.add("Part C (built by ConcreteBuilder1)");
    }
    
    /**
     * Get the resulting product.
     * 
     * @return the built product
     */
    @Override
    public Product getResult() {
        Product result = product;
        reset(); // Reset for future building
        return result;
    }
}
