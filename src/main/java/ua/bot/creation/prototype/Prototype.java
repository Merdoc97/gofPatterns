package ua.bot.creation.prototype;

/**
 * The Prototype interface declares the cloning method.
 * All concrete prototypes must implement this interface.
 */
public interface Prototype {
    
    /**
     * The clone method returns a copy of the object that implements this interface.
     * 
     * @return a clone of this instance
     */
    Prototype clone();
}
