package ua.bot.behaviour.chain;

/**
 * DefaultHandler is a fallback handler that processes any request not handled by other handlers.
 */
public class DefaultHandler extends Handler {
    
    /**
     * Handles any request as a last resort.
     * 
     * @param request the request to be handled
     * @return true always, as it handles all remaining requests
     */
    @Override
    public boolean handle(Request request) {
        System.out.println("DefaultHandler: Handling unhandled request " + request);
        // Default handling for any request
        return true;
    }
}
