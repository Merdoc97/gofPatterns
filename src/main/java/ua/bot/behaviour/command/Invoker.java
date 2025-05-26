package ua.bot.behaviour.command;

import java.util.ArrayList;
import java.util.List;

/**
 * The Invoker class is responsible for initiating requests.
 * It holds a command and at some point asks the command to execute the request.
 * The Invoker does not know which concrete command will be executed.
 */
public class Invoker {
    
    private Command command;
    private final List<Command> history = new ArrayList<>();
    
    /**
     * Sets the command that will be executed.
     *
     * @param command the command to be executed
     */
    public void setCommand(Command command) {
        this.command = command;
    }
    
    /**
     * Executes the command and adds it to the history.
     */
    public void executeCommand() {
        if (command != null) {
            System.out.println("Invoker: Executing command");
            command.execute();
            history.add(command);
        } else {
            System.out.println("Invoker: No command set");
        }
    }
    
    /**
     * Undoes the last executed command.
     */
    public void undoLastCommand() {
        if (!history.isEmpty()) {
            Command lastCommand = history.remove(history.size() - 1);
            System.out.println("Invoker: Undoing last command");
            lastCommand.undo();
        } else {
            System.out.println("Invoker: No commands to undo");
        }
    }
    
    /**
     * Gets the history of executed commands.
     *
     * @return the list of executed commands
     */
    public List<Command> getHistory() {
        return new ArrayList<>(history);
    }
}
