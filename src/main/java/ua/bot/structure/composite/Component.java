package ua.bot.structure.composite;

/**
 * The Component interface defines operations that are common to both simple and
 * complex elements of the composition.
 */
public interface Component {
    
    /**
     * Performs the component's operation.
     */
    void operation();
    
    /**
     * Adds a child component to this component.
     * This is a default operation that only composites should implement meaningfully.
     * 
     * @param component the component to add
     */
    default void add(Component component) {
        throw new UnsupportedOperationException("Cannot add to this component");
    }
    
    /**
     * Removes a child component from this component.
     * This is a default operation that only composites should implement meaningfully.
     * 
     * @param component the component to remove
     */
    default void remove(Component component) {
        throw new UnsupportedOperationException("Cannot remove from this component");
    }
    
    /**
     * Gets a child component at the specified index.
     * This is a default operation that only composites should implement meaningfully.
     * 
     * @param index the index of the child component
     * @return the component at the specified index
     */
    default Component getChild(int index) {
        throw new UnsupportedOperationException("Cannot get child from this component");
    }
    
    /**
     * Returns a string representation to display in the composite hierarchy.
     * 
     * @return the display name of the component
     */
    String getDisplayName();
}
