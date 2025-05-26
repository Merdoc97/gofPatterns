package ua.bot.creation.factory.factorymethod;

/**
 * A demonstration of the Factory Method pattern.
 */
public class FactoryMethodDemo {
    
    /**
     * The main method that demonstrates the Factory Method pattern.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Factory Method Pattern Demonstration");
        System.out.println("------------------------------------");
        
        // Create ConcreteCreatorA and use it
        Creator creatorA = new ConcreteCreatorA();
        System.out.println("\nUsing ConcreteCreatorA:");
        creatorA.someOperation();
        
        // Create ConcreteCreatorB and use it
        Creator creatorB = new ConcreteCreatorB();
        System.out.println("\nUsing ConcreteCreatorB:");
        creatorB.someOperation();
        
        System.out.println("\nKey Points of Factory Method Pattern:");
        System.out.println("1. Defines an interface for creating objects, but lets subclasses decide which classes to instantiate");
        System.out.println("2. Refers to the newly created object through a common interface");
        System.out.println("3. Isolates the client code from the details of object creation");
        System.out.println("4. Provides hooks for subclasses to customize the instantiation process");
    }
}
