package ua.bot.structure.composite;

/**
 * FileSystemLeaf represents a file in a file system.
 * It's a specialized leaf with a file size.
 */
public class FileSystemLeaf implements Component {
    
    private final String name;
    private final int sizeInKB;
    
    /**
     * Creates a new file with the specified name and size.
     * 
     * @param name the name of the file
     * @param sizeInKB the size of the file in kilobytes
     */
    public FileSystemLeaf(String name, int sizeInKB) {
        this.name = name;
        this.sizeInKB = sizeInKB;
    }
    
    /**
     * Performs the file's operation.
     */
    @Override
    public void operation() {
        System.out.println("File: " + name + " (Size: " + sizeInKB + " KB)");
    }
    
    /**
     * Returns the display name of the file.
     * 
     * @return the file's name and size
     */
    @Override
    public String getDisplayName() {
        return "File: " + name + " (Size: " + sizeInKB + " KB)";
    }
    
    /**
     * Returns the size of the file.
     * 
     * @return the size in kilobytes
     */
    public int getSizeInKB() {
        return sizeInKB;
    }
}
