package ua.bot.structure.decorator;

/**
 * The Component interface defines operations that can be altered by decorators.
 * Both concrete components and decorators implement this interface.
 */
public interface Component {
    
    /**
     * Basic operation that concrete components and decorators must implement.
     * 
     * @return a string representing the result of the operation
     */
    String operation();
}
