package ua.bot.creation.builder;

/**
 * Client class that demonstrates the Builder pattern.
 */
public class Client {
    
    /**
     * Main method that demonstrates the Builder pattern.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create director
        Director director = new Director();
        
        // Create builders
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();
        
        // Director with ConcreteBuilder1
        System.out.println("Building with ConcreteBuilder1:");
        director.setBuilder(builder1);
        
        // Build minimal viable product
        System.out.println("\nMinimal Viable Product:");
        director.buildMinimalViableProduct();
        Product product1 = builder1.getResult();
        product1.showParts();
        
        // Build full featured product
        System.out.println("\nFull Featured Product:");
        director.buildFullFeaturedProduct();
        Product product2 = builder1.getResult();
        product2.showParts();
        
        // Director with ConcreteBuilder2
        System.out.println("\nBuilding with ConcreteBuilder2:");
        director.setBuilder(builder2);
        
        // Build custom product
        System.out.println("\nCustom Product:");
        director.buildCustomProduct();
        Product product3 = builder2.getResult();
        product3.showParts();
        
        // Build without director
        System.out.println("\nProduct without Director (Custom building steps):");
        builder2.reset();
        builder2.buildPartA();
        builder2.buildPartB();
        Product product4 = builder2.getResult();
        product4.showParts();
    }
}
