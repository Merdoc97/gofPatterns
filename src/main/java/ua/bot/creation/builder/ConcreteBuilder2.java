package ua.bot.creation.builder;

/**
 * ConcreteBuilder2 is another specific implementation of the Builder interface.
 * It creates and assembles parts of the product in a different way.
 */
public class ConcreteBuilder2 implements Builder {
    
    private Product product;
    
    /**
     * Constructor initializes a new Product instance.
     */
    public ConcreteBuilder2() {
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
     * Build part A with specific implementation for ConcreteBuilder2.
     */
    @Override
    public void buildPartA() {
        product.add("Part X (built by ConcreteBuilder2)");
    }
    
    /**
     * Build part B with specific implementation for ConcreteBuilder2.
     */
    @Override
    public void buildPartB() {
        product.add("Part Y (built by ConcreteBuilder2)");
    }
    
    /**
     * Build part C with specific implementation for ConcreteBuilder2.
     */
    @Override
    public void buildPartC() {
        product.add("Part Z (built by ConcreteBuilder2)");
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
