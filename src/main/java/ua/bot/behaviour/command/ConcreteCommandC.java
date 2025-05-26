package ua.bot.behaviour.command;

/**
 * ConcreteCommandC implements the Command interface and defines the binding
 * between a Receiver object and an action. When execute() is called,
 * the Receiver performs the corresponding operation.
 */
public class ConcreteCommandC implements Command {
    
    private final Receiver receiver;
    
    /**
     * Constructor takes the receiver that will execute the command.
     *
     * @param receiver the receiver to execute the command
     */
    public ConcreteCommandC(Receiver receiver) {
        this.receiver = receiver;
    }
    
    /**
     * Executes the command by invoking the corresponding operation on the receiver.
     */
    @Override
    public void execute() {
        System.out.println("ConcreteCommandC: Calling actionC on Receiver");
        receiver.actionC();
    }
    
    /**
     * Undoes the execution of the command.
     */
    @Override
    public void undo() {
        System.out.println("ConcreteCommandC: Undoing actionC");
        // Implement the logic to undo actionC
    }
}
