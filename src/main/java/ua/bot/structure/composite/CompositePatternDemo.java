package ua.bot.structure.composite;

/**
 * Demo class that shows how the Composite pattern works.
 * This demonstrates the use of both the basic Composite implementation
 * and the specialized file system implementation.
 */
public class CompositePatternDemo {
    
    /**
     * Client code that uses the Composite pattern
     */
    public static void main(String[] args) {
        System.out.println("Composite Pattern Demonstration");
        System.out.println("------------------------------");
        
        // Basic Composite Pattern Demonstration
        System.out.println("1. Basic Composite Pattern Example:");
        
        // Create leaf components
        Component leaf1 = new Leaf("A");
        Component leaf2 = new Leaf("B");
        Component leaf3 = new Leaf("C");
        Component leaf4 = new Leaf("D");
        
        // Create composite components
        Composite composite1 = new Composite("X");
        Composite composite2 = new Composite("Y");
        Composite composite3 = new Composite("Z");
        
        // Build the tree structure
        composite2.add(leaf1);
        composite2.add(leaf2);
        
        composite3.add(leaf3);
        
        composite1.add(composite2);
        composite1.add(composite3);
        composite1.add(leaf4);
        
        // Display the structure
        System.out.println("\nTree Structure:");
        composite1.displayStructure("");
        
        // Perform operation on the entire tree
        System.out.println("\nOperation on entire tree:");
        composite1.operation();
        
        // Perform operation on a subtree
        System.out.println("\nOperation on subtree:");
        composite2.operation();
        
        // File System Example using Composite Pattern
        System.out.println("\n\n2. File System Example with Composite Pattern:");
        
        // Create files (leaves)
        FileSystemLeaf file1 = new FileSystemLeaf("document.txt", 10);
        FileSystemLeaf file2 = new FileSystemLeaf("image.jpg", 200);
        FileSystemLeaf file3 = new FileSystemLeaf("spreadsheet.xlsx", 50);
        FileSystemLeaf file4 = new FileSystemLeaf("presentation.pptx", 100);
        FileSystemLeaf file5 = new FileSystemLeaf("config.xml", 5);
        
        // Create directories (composites)
        FileSystemComposite rootDir = new FileSystemComposite("root");
        FileSystemComposite docsDir = new FileSystemComposite("documents");
        FileSystemComposite imagesDir = new FileSystemComposite("images");
        FileSystemComposite configDir = new FileSystemComposite("config");
        
        // Build the file system structure
        docsDir.add(file1);
        docsDir.add(file3);
        docsDir.add(file4);
        
        imagesDir.add(file2);
        
        configDir.add(file5);
        
        rootDir.add(docsDir);
        rootDir.add(imagesDir);
        rootDir.add(configDir);
        
        // Display the file system structure
        System.out.println("\nFile System Structure:");
        rootDir.displayStructure("");
        
        // Calculate and display sizes
        System.out.println("\nDirectory Sizes:");
        System.out.println("Total size of root: " + rootDir.calculateSize() + " KB");
        System.out.println("Size of documents directory: " + docsDir.calculateSize() + " KB");
        System.out.println("Size of images directory: " + imagesDir.calculateSize() + " KB");
        System.out.println("Size of config directory: " + configDir.calculateSize() + " KB");
    }
}
