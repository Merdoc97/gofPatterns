package ua.bot.creation.factory.abstractfactory;

/**
 * A demonstration of the Abstract Factory pattern.
 */
public class AbstractFactoryDemo {
    
    /**
     * The main method that demonstrates the Abstract Factory pattern.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Abstract Factory Pattern Demonstration");
        System.out.println("--------------------------------------");
        
        // Using the first factory to create products
        System.out.println("\n1. Using ConcreteFactory1:");
        AbstractFactory factory1 = new ConcreteFactory1();
        Client client1 = new Client(factory1);
        client1.executeOperations();
        
        // Using the second factory to create products
        System.out.println("\n2. Using ConcreteFactory2:");
        AbstractFactory factory2 = new ConcreteFactory2();
        Client client2 = new Client(factory2);
        client2.executeOperations();
        
        System.out.println("\nKey Points of Abstract Factory Pattern:");
        System.out.println("1. Provides an interface for creating families of related or dependent objects");
        System.out.println("2. Creates objects without specifying their concrete classes");
        System.out.println("3. Ensures that created objects work together properly");
        System.out.println("4. Isolates concrete classes from the client");
        System.out.println("5. Makes exchanging product families easy");
    }
}
