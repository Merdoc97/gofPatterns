package ua.bot.behaviour.chain;

/**
 * TypeCHandler is a concrete handler that processes Type C requests.
 */
public class TypeCHandler extends Handler {
    
    /**
     * Handles Type C requests or passes to the next handler.
     * 
     * @param request the request to be handled
     * @return true if the request was handled, false otherwise
     */
    @Override
    public boolean handle(Request request) {
        if ("TypeC".equals(request.getType())) {
            System.out.println("TypeCHandler: Handling " + request);
            // Perform processing specific to Type C requests
            return true;
        } else if (nextHandler != null) {
            System.out.println("TypeCHandler: Passing to next handler");
            return nextHandler.handle(request);
        } else {
            System.out.println("TypeCHandler: Cannot handle request and no next handler");
            return false;
        }
    }
}
