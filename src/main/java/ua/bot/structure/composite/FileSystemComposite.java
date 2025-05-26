package ua.bot.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * FileSystemComposite represents a directory in a file system.
 * It can contain both files (leaves) and other directories (composites).
 */
public class FileSystemComposite implements Component {
    
    private final String name;
    private final List<Component> children = new ArrayList<>();
    
    /**
     * Creates a new directory with the specified name.
     * 
     * @param name the name of the directory
     */
    public FileSystemComposite(String name) {
        this.name = name;
    }
    
    /**
     * Performs the directory's operation and recursively calls operation()
     * on all its children.
     */
    @Override
    public void operation() {
        System.out.println("Directory: " + name + " (Size: " + calculateSize() + " KB)");
        
        // Execute operation on all children
        for (Component component : children) {
            component.operation();
        }
    }
    
    /**
     * Adds a child component (file or directory) to this directory.
     * 
     * @param component the component to add
     */
    @Override
    public void add(Component component) {
        children.add(component);
    }
    
    /**
     * Removes a child component from this directory.
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
     * Returns the display name of the directory.
     * 
     * @return the directory's name
     */
    @Override
    public String getDisplayName() {
        return "Directory: " + name + " (Size: " + calculateSize() + " KB)";
    }
    
    /**
     * Calculates the total size of the directory by summing up the sizes of all its children.
     * 
     * @return the total size in kilobytes
     */
    public int calculateSize() {
        int totalSize = 0;
        
        for (Component component : children) {
            if (component instanceof FileSystemLeaf) {
                totalSize += ((FileSystemLeaf) component).getSizeInKB();
            } else if (component instanceof FileSystemComposite) {
                totalSize += ((FileSystemComposite) component).calculateSize();
            }
        }
        
        return totalSize;
    }
    
    /**
     * Displays the hierarchical structure of this directory.
     * 
     * @param indent the indentation to use for the display
     */
    public void displayStructure(String indent) {
        System.out.println(indent + getDisplayName());
        
        for (Component component : children) {
            if (component instanceof FileSystemComposite) {
                ((FileSystemComposite) component).displayStructure(indent + "  ");
            } else {
                System.out.println(indent + "  " + component.getDisplayName());
            }
        }
    }
}
