package ua.bot.structure.adapter;

/**
 * The ClassAdapter makes the Adaptee's interface compatible with the Target's interface.
 * This is an example of the Class Adapter pattern, which uses inheritance to adapt
 * the Adaptee to the Target interface.
 */
public class ClassAdapter extends Adaptee implements Target {
    
    /**
     * Implements the Target interface's request method.
     * This method adapts the inherited specificRequest method to the
     * Target's request method that clients expect.
     * 
     * @return adapted result from the adaptee
     */
    @Override
    public String request() {
        // You might need to convert the output or do additional processing here
        String result = specificRequest();
        return "ClassAdapter: (TRANSLATED) " + result;
    }
}
