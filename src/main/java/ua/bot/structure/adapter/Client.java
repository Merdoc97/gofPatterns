package ua.bot.structure.adapter;

/**
 * The Client class works with objects that implement the Target interface.
 * This demonstrates how the client code can work with the adaptee through the adapter.
 */
public class Client {
    
    /**
     * Works with any object that implements the Target interface.
     * 
     * @param target an object implementing the Target interface
     */
    public void executeRequest(Target target) {
        String result = target.request();
        System.out.println("Client: Received result: " + result);
    }
}
