package ua.bot.creation.factory.factorymethod;

import ua.bot.creation.factory.Product;

/**
 * The Creator interface declares the factory method that returns a new product object.
 * It may also include some core business logic that relies on Product objects.
 */
public interface Creator {
    
    /**
     * Factory method that should return a new Product instance.
     * 
     * @return a new Product instance
     */
    Product createProduct();
    
    /**
     * Creator may also contain some core business logic that
     * uses the products returned by the factory method.
     */
    default void someOperation() {
        // Call the factory method to create a Product object
        Product product = createProduct();
        
        // Use the product
        System.out.println("Creator: Working with " + product.getName());
        product.operation();
    }
}
