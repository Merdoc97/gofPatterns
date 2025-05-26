package ua.bot.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * The Composite class represents complex components that may have children.
 * It defines behavior for components that have child components and stores
 * child components.
 */
public class Composite implements Component {
    
    private final String name;
    private final List<Component> children = new ArrayList<>();
    
    /**
     * Creates a new composite with the specified name.
     * 
     * @param name the name of the composite
     */
    public Composite(String name) {
        this.name = name;
    }
    
    /**
     * Performs the composite's operation and recursively calls operation()
     * on all its children.
     */
    @Override
    public void operation() {
        System.out.println("Composite " + name + " operation");
        
        // Execute operation on all children
        for (Component component : children) {
            component.operation();
        }
    }
    
    /**
     * Adds a child component to this composite.
     * 
     * @param component the component to add
     */
    @Override
    public void add(Component component) {
        children.add(component);
    }
    
    /**
     * Removes a child component from this composite.
     * 
     * @param component the component to remove
     */
    @Override
    public void remove(Component component) {
        children.remove(component);
    }
    
    /**
     * Gets a child component at the specified index.
     * 
     * @param index the index of the child component
     * @return the component at the specified index
     */
    @Override
    public Component getChild(int index) {
        return children.get(index);
    }
    
    /**
     * Returns the display name of the composite.
     * 
     * @return the composite's name
     */
    @Override
    public String getDisplayName() {
        return "Composite " + name;
    }
    
    /**
     * Returns the number of children in this composite.
     * 
     * @return the number of children
     */
    public int getChildCount() {
        return children.size();
    }
    
    /**
     * Displays the hierarchical structure of this composite.
     * 
     * @param indent the indentation to use for the display
     */
    public void displayStructure(String indent) {
        System.out.println(indent + getDisplayName());
        
        for (Component component : children) {
            if (component instanceof Composite) {
                ((Composite) component).displayStructure(indent + "  ");
            } else {
                System.out.println(indent + "  " + component.getDisplayName());
            }
        }
    }
}
