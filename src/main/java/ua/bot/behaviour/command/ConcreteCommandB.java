package ua.bot.behaviour.command;

/**
 * ConcreteCommandB implements the Command interface and defines the binding
 * between a Receiver object and an action. When execute() is called,
 * the Receiver performs the corresponding operation.
 */
public class ConcreteCommandB implements Command {
    
    private final Receiver receiver;
    
    /**
     * Constructor takes the receiver that will execute the command.
     *
     * @param receiver the receiver to execute the command
     */
    public ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }
    
    /**
     * Executes the command by invoking the corresponding operation on the receiver.
     */
    @Override
    public void execute() {
        System.out.println("ConcreteCommandB: Calling actionB on Receiver");
        receiver.actionB();
    }
    
    /**
     * Undoes the execution of the command.
     */
    @Override
    public void undo() {
        System.out.println("ConcreteCommandB: Undoing actionB");
        // Implement the logic to undo actionB
    }
}
