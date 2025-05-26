package ua.bot.behaviour.command;

/**
 * The Receiver class knows how to perform the operations associated
 * with carrying out a request. Any class can serve as a Receiver.
 * The Receiver implements the actual business logic for commands.
 */
public class Receiver {
    
    /**
     * First action that can be performed by the receiver.
     */
    public void actionA() {
        System.out.println("Receiver: Performing Action A");
        // Real implementation would have business logic here
    }
    
    /**
     * Second action that can be performed by the receiver.
     */
    public void actionB() {
        System.out.println("Receiver: Performing Action B");
        // Real implementation would have business logic here
    }
    
    /**
     * Third action that can be performed by the receiver.
     */
    public void actionC() {
        System.out.println("Receiver: Performing Action C");
        // Real implementation would have business logic here
    }
}
