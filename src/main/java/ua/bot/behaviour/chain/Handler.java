package ua.bot.behaviour.chain;

/**
 * The Handler abstract class defines the interface for handling requests
 * and implements the successor link (next handler).
 */
public abstract class Handler {
    
    protected Handler nextHandler;
    
    /**
     * Sets the next handler in the chain.
     * 
     * @param nextHandler the next handler
     * @return the next handler for convenient chaining
     */
    public Handler setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }
    
    /**
     * Handles the request or passes it to the next handler in the chain.
     * 
     * @param request the request to be handled
     * @return true if the request was handled, false otherwise
     */
    public abstract boolean handle(Request request);
}
