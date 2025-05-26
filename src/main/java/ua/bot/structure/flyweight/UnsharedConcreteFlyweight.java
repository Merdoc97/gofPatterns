package ua.bot.structure.flyweight;

/**
 * UnsharedConcreteFlyweight implements the Flyweight interface but does not share instances.
 * This class is used for flyweight objects that cannot be shared due to their unique state.
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    
    /**
     * All state in the unshared flyweight - not separated into intrinsic and extrinsic
     */
    private final String allState;
    
    /**
     * Constructor initializes all the state
     * 
     * @param allState the unique state for this unshared flyweight
     */
    public UnsharedConcreteFlyweight(String allState) {
        this.allState = allState;
        System.out.println("Creating UnsharedConcreteFlyweight with state: " + allState);
    }
    
    /**
     * Operation that uses the internal state plus the extrinsic state
     * 
     * @param extrinsicState additional state provided by the client
     */
    @Override
    public void operation(String extrinsicState) {
        System.out.println("UnsharedConcreteFlyweight: All State = " + allState 
                + ", Additional Extrinsic State = " + extrinsicState);
    }
}
