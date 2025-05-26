package ua.bot.behaviour.strategy;

/**
 * ConcreteStrategyC implements the algorithm for Strategy C.
 * It provides a specific implementation of the execute method.
 */
public class ConcreteStrategyC implements Strategy {
    
    /**
     * Executes the algorithm for Strategy C.
     * This implementation reverses the input string.
     *
     * @param data the input data for the algorithm
     * @return the result of the algorithm execution
     */
    @Override
    public String execute(String data) {
        System.out.println("Executing Strategy C: Reverse the string");
        return new StringBuilder(data).reverse().toString();
    }
}
