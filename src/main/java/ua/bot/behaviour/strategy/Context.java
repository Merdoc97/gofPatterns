package ua.bot.behaviour.strategy;

/**
 * The Context defines the interface of interest to clients.
 * It maintains a reference to a Strategy object and delegates
 * the algorithm execution to the Strategy object.
 */
public class Context {
    
    private Strategy strategy;
    
    /**
     * Constructor that takes a strategy as a parameter.
     *
     * @param strategy the initial strategy to use
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    /**
     * Sets a new strategy to use.
     *
     * @param strategy the new strategy to use
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
        System.out.println("Context: Strategy changed");
    }
    
    /**
     * Executes the strategy with the provided data.
     *
     * @param data the input data for the strategy
     * @return the result of the strategy execution
     */
    public String executeStrategy(String data) {
        System.out.println("Context: Delegating algorithm execution to the strategy");
        return strategy.execute(data);
    }
}
