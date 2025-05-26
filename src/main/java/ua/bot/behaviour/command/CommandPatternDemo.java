package ua.bot.behaviour.command;

/**
 * A demonstration of the Command Pattern.
 * This class shows how the Command pattern encapsulates a request as an object,
 * allowing for parameterization of clients with different requests, queuing of requests,
 * and support for undoable operations.
 */
public class CommandPatternDemo {
    
    /**
     * Main method to demonstrate the Command Pattern.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Command Pattern Demonstration");
        System.out.println("----------------------------");
        
        // Create receiver
        Receiver receiver = new Receiver();
        
        // Create commands
        Command commandA = new ConcreteCommandA(receiver);
        Command commandB = new ConcreteCommandB(receiver);
        Command commandC = new ConcreteCommandC(receiver);
        
        // Create invoker
        Invoker invoker = new Invoker();
        
        // Execute commands
        System.out.println("\nExecuting Command A:");
        invoker.setCommand(commandA);
        invoker.executeCommand();
        
        System.out.println("\nExecuting Command B:");
        invoker.setCommand(commandB);
        invoker.executeCommand();
        
        System.out.println("\nExecuting Command C:");
        invoker.setCommand(commandC);
        invoker.executeCommand();
        
        // Undo last command
        System.out.println("\nUndoing last command:");
        invoker.undoLastCommand();
        
        // Show command history
        System.out.println("\nCommand history size: " + invoker.getHistory().size());
        
        System.out.println("\nKey Points of Command Pattern:");
        System.out.println("1. Decouples the object that invokes the operation from the object that performs the operation");
        System.out.println("2. Encapsulates a request as an object, allowing parameterization of clients with different requests");
        System.out.println("3. Supports undoable operations by implementing the undo method");
        System.out.println("4. Allows queuing of commands and keeping a history of executed commands");
        System.out.println("5. Supports composite commands that execute multiple commands as a single unit");
    }
}
