package ua.bot.behaviour.chain;

/**
 * TypeAHandler is a concrete handler that processes Type A requests.
 */
public class TypeAHandler extends Handler {
    
    /**
     * Handles Type A requests or passes to the next handler.
     * 
     * @param request the request to be handled
     * @return true if the request was handled, false otherwise
     */
    @Override
    public boolean handle(Request request) {
        if ("TypeA".equals(request.getType())) {
            System.out.println("TypeAHandler: Handling " + request);
            // Perform processing specific to Type A requests
            return true;
        } else if (nextHandler != null) {
            System.out.println("TypeAHandler: Passing to next handler");
            return nextHandler.handle(request);
        } else {
            System.out.println("TypeAHandler: Cannot handle request and no next handler");
            return false;
        }
    }
}
