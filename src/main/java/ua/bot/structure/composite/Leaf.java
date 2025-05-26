package ua.bot.structure.composite;

/**
 * The Leaf class represents end objects of a composition.
 * A leaf can't have any children.
 */
public class Leaf implements Component {
    
    private final String name;
    
    /**
     * Creates a new leaf with the specified name.
     * 
     * @param name the name of the leaf
     */
    public Leaf(String name) {
        this.name = name;
    }
    
    /**
     * Performs the leaf's operation.
     */
    @Override
    public void operation() {
        System.out.println("Leaf " + name + " operation");
    }
    
    /**
     * Returns the display name of the leaf.
     * 
     * @return the leaf's name
     */
    @Override
    public String getDisplayName() {
        return "Leaf " + name;
    }
}
