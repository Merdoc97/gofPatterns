package ua.bot.structure.adapter;

/**
 * The Adaptee contains some useful behavior, but its interface is incompatible
 * with the existing client code. The Adaptee needs some adaptation before the
 * client code can use it.
 */
public class Adaptee {
    
    /**
     * A specific request implemented by the Adaptee.
     * This method has a different interface than what the client expects.
     * 
     * @return result of the specific request operation
     */
    public String specificRequest() {
        return "Adaptee: This is the specific request from Adaptee.";
    }
}
