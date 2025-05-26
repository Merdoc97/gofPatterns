package ua.bot.behaviour.strategy;

/**
 * ConcreteStrategyB implements the algorithm for Strategy B.
 * It provides a specific implementation of the execute method.
 */
public class ConcreteStrategyB implements Strategy {
    
    /**
     * Executes the algorithm for Strategy B.
     * This implementation converts the input string to lowercase.
     *
     * @param data the input data for the algorithm
     * @return the result of the algorithm execution
     */
    @Override
    public String execute(String data) {
        System.out.println("Executing Strategy B: Convert to lowercase");
        return data.toLowerCase();
    }
}
