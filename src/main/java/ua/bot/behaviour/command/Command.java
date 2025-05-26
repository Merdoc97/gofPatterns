package ua.bot.behaviour.command;

/**
 * The Command interface declares a method for executing a command.
 * All concrete command classes must implement this interface.
 */
public interface Command {
    
    /**
     * Executes the command. This method invokes the corresponding
     * operation on the Receiver.
     */
    void execute();
    
    /**
     * Optional method that undoes the command execution.
     * This enables support for reversible operations.
     */
    default void undo() {
        // Default implementation does nothing
    }
}
