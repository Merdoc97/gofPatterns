package ua.bot.behaviour.state;

/**
 * A demonstration of the State Pattern.
 * This class shows how the context's behavior changes as its internal state changes.
 */
public class StatePatternDemo {
    
    /**
     * Main method to demonstrate the State Pattern.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("State Pattern Demonstration");
        System.out.println("---------------------------");
        
        // Create a context with an initial state
        Context context = new Context(new ConcreteStateA());
        
        // Request operations from the context multiple times
        // Each time, the context's state changes, and its behavior changes
        System.out.println("\nFirst request:");
        context.request(); // This will change state to B
        
        System.out.println("\nSecond request:");
        context.request(); // This will change state to C
        
        System.out.println("\nThird request:");
        context.request(); // This will change state back to A
        
        System.out.println("\nFourth request:");
        context.request(); // This will change state to B again
        
        System.out.println("\nKey Points of State Pattern:");
        System.out.println("1. Encapsulates state-specific behavior in separate state classes");
        System.out.println("2. Makes state transitions explicit");
        System.out.println("3. State objects can be shared if they have no instance variables");
        System.out.println("4. Eliminates the need for large conditional statements");
        System.out.println("5. Makes it easy to add new states and state transitions");
    }
}
