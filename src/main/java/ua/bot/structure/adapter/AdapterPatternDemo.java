package ua.bot.structure.adapter;

/**
 * Demo class that shows how the Adapter pattern works.
 * This demonstrates both the Object Adapter and Class Adapter implementations.
 */
public class AdapterPatternDemo {
    
    /**
     * Client code that uses the Adapter pattern
     */
    public static void main(String[] args) {
        System.out.println("Adapter Pattern Demonstration");
        System.out.println("----------------------------");
        
        // Create the client
        Client client = new Client();
        
        // Object Adapter Pattern Demonstration
        System.out.println("\n1. Object Adapter Pattern Example:");
        
        // The client expects to work with Target objects
        System.out.println("Client wants to execute a request on a Target object.");
        
        // Create an instance of Adaptee
        Adaptee adaptee = new Adaptee();
        System.out.println("Direct call to Adaptee:");
        System.out.println("Adaptee result: " + adaptee.specificRequest());
        
        // Create an Adapter that wraps the Adaptee
        Target adapter = new Adapter(adaptee);
        
        // The client can work with the Adaptee through the Adapter
        System.out.println("\nClient call to Adapter:");
        client.executeRequest(adapter);
        
        // Class Adapter Pattern Demonstration
        System.out.println("\n2. Class Adapter Pattern Example:");
        
        // Create a ClassAdapter (no need to instantiate Adaptee separately)
        Target classAdapter = new ClassAdapter();
        
        // The client can work with the Adaptee through the ClassAdapter
        System.out.println("Client call to ClassAdapter:");
        client.executeRequest(classAdapter);
        
        // Explanation of key points
        System.out.println("\nKey Points of the Adapter Pattern:");
        System.out.println("1. The client works with the Target interface");
        System.out.println("2. The Adapter implements the Target interface");
        System.out.println("3. The Adapter delegates calls to the Adaptee");
        System.out.println("4. The client can work with incompatible interfaces through the Adapter");
        System.out.println("5. Object Adapter uses composition, Class Adapter uses inheritance");
    }
}
