package ua.bot.behaviour.chain;

/**
 * TypeBHandler is a concrete handler that processes Type B requests.
 */
public class TypeBHandler extends Handler {
    
    /**
     * Handles Type B requests or passes to the next handler.
     * 
     * @param request the request to be handled
     * @return true if the request was handled, false otherwise
     */
    @Override
    public boolean handle(Request request) {
        if ("TypeB".equals(request.getType())) {
            System.out.println("TypeBHandler: Handling " + request);
            // Perform processing specific to Type B requests
            return true;
        } else if (nextHandler != null) {
            System.out.println("TypeBHandler: Passing to next handler");
            return nextHandler.handle(request);
        } else {
            System.out.println("TypeBHandler: Cannot handle request and no next handler");
            return false;
        }
    }
}
