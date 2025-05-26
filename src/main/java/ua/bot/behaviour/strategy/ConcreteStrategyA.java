package ua.bot.behaviour.strategy;

/**
 * ConcreteStrategyA implements the algorithm for Strategy A.
 * It provides a specific implementation of the execute method.
 */
public class ConcreteStrategyA implements Strategy {
    
    /**
     * Executes the algorithm for Strategy A.
     * This implementation converts the input string to uppercase.
     *
     * @param data the input data for the algorithm
     * @return the result of the algorithm execution
     */
    @Override
    public String execute(String data) {
        System.out.println("Executing Strategy A: Convert to uppercase");
        return data.toUpperCase();
    }
}
