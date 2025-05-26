package ua.bot.structure.bridge;

/**
 * Demo class that shows how the Bridge pattern works.
 * This demonstrates how clients can use the Abstraction without being aware
 * of the specific Implementor being used.
 */
public class BridgePatternDemo {
    
    /**
     * Client code that uses the Bridge pattern
     */
    public static void main(String[] args) {
        System.out.println("Bridge Pattern Demonstration");
        System.out.println("---------------------------");
        
        // Create implementors
        Implementor implementorA = new ConcreteImplementorA();
        Implementor implementorB = new ConcreteImplementorB();
        
        // Create abstractions with different implementors
        Abstraction abstractionA = new RefinedAbstraction(implementorA);
        Abstraction abstractionB = new RefinedAbstraction(implementorB);
        
        // Use the abstractions with implementor A
        System.out.println("\nUsing RefinedAbstraction with ConcreteImplementorA:");
        abstractionA.operation();
        
        // Use the additional operation in RefinedAbstraction with implementor A
        System.out.println("\nUsing additional operation with ConcreteImplementorA:");
        ((RefinedAbstraction) abstractionA).additionalOperation();
        
        // Use the abstractions with implementor B
        System.out.println("\nUsing RefinedAbstraction with ConcreteImplementorB:");
        abstractionB.operation();
        
        // Use the additional operation in RefinedAbstraction with implementor B
        System.out.println("\nUsing additional operation with ConcreteImplementorB:");
        ((RefinedAbstraction) abstractionB).additionalOperation();
        
        // Create a base abstraction with implementor A
        Abstraction baseAbstraction = new Abstraction(implementorA) {};
        System.out.println("\nUsing base Abstraction with ConcreteImplementorA:");
        baseAbstraction.operation();
        
        // This demonstrates the key benefit of the Bridge pattern:
        // We can vary the abstraction and implementation independently.
        // Both the Abstraction hierarchy and the Implementor hierarchy can be
        // extended without affecting each other.
    }
}
