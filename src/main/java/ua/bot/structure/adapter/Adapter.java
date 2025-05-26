package ua.bot.structure.adapter;

/**
 * The Adapter makes the Adaptee's interface compatible with the Target's interface.
 * This is an example of the Object Adapter pattern, which uses composition to adapt
 * the Adaptee to the Target interface.
 */
public class Adapter implements Target {
    
    private final Adaptee adaptee;
    
    /**
     * Constructor that accepts an Adaptee instance.
     * 
     * @param adaptee the adaptee to adapt
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    
    /**
     * Implements the Target interface's request method.
     * This method adapts the Adaptee's specificRequest method to the
     * Target's request method that clients expect.
     * 
     * @return adapted result from the adaptee
     */
    @Override
    public String request() {
        // You might need to convert the output or do additional processing here
        String result = adaptee.specificRequest();
        return "Adapter: (TRANSLATED) " + result;
    }
}
