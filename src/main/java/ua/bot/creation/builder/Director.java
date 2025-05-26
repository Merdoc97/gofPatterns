package ua.bot.creation.builder;

/**
 * Director defines the order in which to call construction steps.
 * It works with any builder instance that follows the Builder interface.
 */
public class Director {
    
    private Builder builder;
    
    /**
     * Set the builder instance to use.
     * 
     * @param builder the builder to use for construction
     */
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    
    /**
     * Get the current builder.
     * 
     * @return the current builder
     */
    public Builder getBuilder() {
        return builder;
    }
    
    /**
     * Construct a minimal product with only part A.
     */
    public void buildMinimalViableProduct() {
        builder.buildPartA();
    }
    
    /**
     * Construct a full featured product with all parts.
     */
    public void buildFullFeaturedProduct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
    
    /**
     * Construct a custom product with parts A and C.
     */
    public void buildCustomProduct() {
        builder.buildPartA();
        builder.buildPartC();
    }
}
