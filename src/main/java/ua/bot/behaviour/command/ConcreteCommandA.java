package ua.bot.behaviour.command;

/**
 * ConcreteCommandA implements the Command interface and defines the binding
 * between a Receiver object and an action. When execute() is called,
 * the Receiver performs the corresponding operation.
 */
public class ConcreteCommandA implements Command {
    
    private final Receiver receiver;
    
    /**
     * Constructor takes the receiver that will execute the command.
     *
     * @param receiver the receiver to execute the command
     */
    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }
    
    /**
     * Executes the command by invoking the corresponding operation on the receiver.
     */
    @Override
    public void execute() {
        System.out.println("ConcreteCommandA: Calling actionA on Receiver");
        receiver.actionA();
    }
    
    /**
     * Undoes the execution of the command.
     */
    @Override
    public void undo() {
        System.out.println("ConcreteCommandA: Undoing actionA");
        // Implement the logic to undo actionA
    }
}
