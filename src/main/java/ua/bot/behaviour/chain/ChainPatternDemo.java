package ua.bot.behaviour.chain;

/**
 * A demonstration of the Chain of Responsibility Pattern.
 * This class shows how to create and use a chain of handlers.
 */
public class ChainPatternDemo {
    
    /**
     * Main method to demonstrate the Chain of Responsibility Pattern.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Chain of Responsibility Pattern Demonstration");
        System.out.println("--------------------------------------------");
        
        // Create handlers
        Handler typeAHandler = new TypeAHandler();
        Handler typeBHandler = new TypeBHandler();
        Handler typeCHandler = new TypeCHandler();
        Handler defaultHandler = new DefaultHandler();
        
        // Build the chain
        typeAHandler.setNext(typeBHandler).setNext(typeCHandler).setNext(defaultHandler);
        
        // Create requests
        Request requestA = new Request("TypeA", "This is a Type A request");
        Request requestB = new Request("TypeB", "This is a Type B request");
        Request requestC = new Request("TypeC", "This is a Type C request");
        Request requestUnknown = new Request("Unknown", "This is an unknown request type");
        
        // Process requests through the chain
        System.out.println("\nProcessing Type A request:");
        typeAHandler.handle(requestA);
        
        System.out.println("\nProcessing Type B request:");
        typeAHandler.handle(requestB);
        
        System.out.println("\nProcessing Type C request:");
        typeAHandler.handle(requestC);
        
        System.out.println("\nProcessing Unknown request:");
        typeAHandler.handle(requestUnknown);
        
        System.out.println("\nDemonstrating starting the chain at a different point:");
        typeBHandler.handle(requestA); // Type A request starting from Type B handler
        
        System.out.println("\nKey Points of Chain of Responsibility Pattern:");
        System.out.println("1. Decouples sender and receiver of a request");
        System.out.println("2. Gives multiple objects a chance to handle the request");
        System.out.println("3. Reduces coupling by eliminating the need for the sender to know which object will handle the request");
        System.out.println("4. Adds flexibility in distributing responsibilities among objects");
    }
}
