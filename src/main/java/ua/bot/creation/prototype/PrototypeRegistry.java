package ua.bot.creation.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * PrototypeRegistry is a container for prototype instances.
 * It provides a way to access and retrieve prototypes by name.
 */
public class PrototypeRegistry {
    
    private Map<String, Prototype> prototypes = new HashMap<>();
    
    /**
     * Adds a prototype to the registry.
     * 
     * @param key the key to identify the prototype
     * @param prototype the prototype to add
     */
    public void addPrototype(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }
    
    /**
     * Retrieves a prototype from the registry by its key.
     * 
     * @param key the key of the prototype to retrieve
     * @return the prototype associated with the key, or null if not found
     */
    public Prototype getPrototype(String key) {
        return prototypes.get(key);
    }
    
    /**
     * Creates a clone of a prototype in the registry.
     * 
     * @param key the key of the prototype to clone
     * @return a clone of the prototype, or null if the key is not found
     */
    public Prototype clonePrototype(String key) {
        Prototype prototype = prototypes.get(key);
        return prototype != null ? prototype.clone() : null;
    }
}
