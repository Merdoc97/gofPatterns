package ua.bot.structure.flyweight;

/**
 * ConcreteFlyweight implements the Flyweight interface and stores intrinsic state.
 * This state is shared and does not depend on the context in which the flyweight is used.
 */
public class ConcreteFlyweight implements Flyweight {
    
    /**
     * Intrinsic state - shared across all instances of this flyweight
     */
    private final String intrinsicState;
    
    /**
     * Constructor initializes the intrinsic state
     * 
     * @param intrinsicState the shared state
     */
    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
        System.out.println("Creating ConcreteFlyweight with intrinsic state: " + intrinsicState);
    }
    
    /**
     * Operation that combines intrinsic and extrinsic states
     * 
     * @param extrinsicState the state that varies per client
     */
    @Override
    public void operation(String extrinsicState) {
        System.out.println("ConcreteFlyweight: Intrinsic State = " + intrinsicState 
                + ", Extrinsic State = " + extrinsicState);
    }
}
