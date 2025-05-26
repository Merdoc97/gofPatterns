package ua.bot.creation.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Product represents a complex object to be created by the Builder pattern.
 * It has multiple parts that are built step by step.
 */
public class Product {
    private final List<String> parts = new ArrayList<>();
    
    /**
     * Add a part to the product.
     * 
     * @param part the part to add
     */
    public void add(String part) {
        parts.add(part);
    }
    
    /**
     * Lists all parts of the product.
     */
    public void showParts() {
        System.out.println("Product Parts:");
        for (String part : parts) {
            System.out.println("- " + part);
        }
    }
    
    /**
     * Gets all parts of the product.
     * 
     * @return list of all parts
     */
    public List<String> getParts() {
        return new ArrayList<>(parts);
    }
}
