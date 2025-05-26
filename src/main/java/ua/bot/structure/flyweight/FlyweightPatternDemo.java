package ua.bot.structure.flyweight;

/**
 * Demo class that shows how the Flyweight pattern works.
 */
public class FlyweightPatternDemo {
    
    /**
     * Client code that uses the Flyweight pattern
     */
    public static void main(String[] args) {
        System.out.println("Flyweight Pattern Demonstration");
        System.out.println("------------------------------");
        
        // Create the flyweight factory
        FlyweightFactory factory = new FlyweightFactory();
        
        // Use existing flyweights from the factory with different extrinsic states
        Flyweight red = factory.getFlyweight("Red");
        red.operation("Canvas1");
        
        Flyweight green = factory.getFlyweight("Green");
        green.operation("Canvas2");
        
        // Reuse an existing flyweight
        Flyweight anotherRed = factory.getFlyweight("Red");
        anotherRed.operation("Canvas3");
        
        // Create a new shared flyweight
        Flyweight yellow = factory.getFlyweight("Yellow");
        yellow.operation("Canvas4");
        
        // Create an unshared flyweight
        Flyweight unshared = factory.createUnsharedFlyweight("Special");
        unshared.operation("Canvas5");
        
        // Show how many flyweights are in the factory
        System.out.println("\nTotal number of shared flyweights: " + factory.getFlyweightCount());
    }
}
