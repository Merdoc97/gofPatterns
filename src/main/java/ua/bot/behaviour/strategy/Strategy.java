package ua.bot.behaviour.strategy;

/**
 * The Strategy interface declares an operation common to all supported algorithms.
 * The Context uses this interface to call the algorithm defined by concrete strategies.
 */
public interface Strategy {
    
    /**
     * The algorithm execution method that concrete strategies must implement.
     *
     * @param data the input data for the algorithm
     * @return the result of the algorithm execution
     */
    String execute(String data);
}
