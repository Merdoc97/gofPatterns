package ua.bot.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory creates and manages flyweight objects.
 * It ensures that flyweights are shared properly. When a client requests a flyweight,
 * the factory either returns an existing instance or creates a new one if it doesn't exist.
 */
public class FlyweightFactory {
    
    /**
     * Pool of flyweight objects indexed by keys
     */
    private final Map<String, Flyweight> flyweights = new HashMap<>();
    
    /**
     * Constructor initializes the factory with some predefined flyweights
     */
    public FlyweightFactory() {
        // Pre-create some flyweights with common intrinsic states
        flyweights.put("Red", new ConcreteFlyweight("Red"));
        flyweights.put("Green", new ConcreteFlyweight("Green"));
        flyweights.put("Blue", new ConcreteFlyweight("Blue"));
    }
    
    /**
     * Returns a Flyweight based on a key (creates it if it doesn't exist)
     * 
     * @param key the intrinsic state that identifies the flyweight
     * @return the flyweight identified by the key
     */
    public Flyweight getFlyweight(String key) {
        if (!flyweights.containsKey(key)) {
            System.out.println("FlyweightFactory: Can't find a flyweight with key " + key + ", creating new one");
            flyweights.put(key, new ConcreteFlyweight(key));
        } else {
            System.out.println("FlyweightFactory: Reusing existing flyweight with key " + key);
        }
        return flyweights.get(key);
    }
    
    /**
     * Returns the total number of flyweights in the factory
     * 
     * @return count of flyweights
     */
    public int getFlyweightCount() {
        return flyweights.size();
    }
    
    /**
     * Creates an unshared flyweight (not stored in the pool)
     * 
     * @param state the unique state for the unshared flyweight
     * @return an unshared flyweight
     */
    public Flyweight createUnsharedFlyweight(String state) {
        return new UnsharedConcreteFlyweight(state);
    }
}
