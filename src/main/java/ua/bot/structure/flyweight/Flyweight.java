package ua.bot.structure.flyweight;

/**
 * The Flyweight interface defines operations that can accept and act on extrinsic state.
 * Flyweight objects use shared intrinsic state to represent potentially large numbers
 * of smaller fine-grained objects.
 */
public interface Flyweight {
    
    /**
     * Operation that uses extrinsic state passed by the client.
     * 
     * @param extrinsicState state that varies per client and is not shared
     */
    void operation(String extrinsicState);
}
