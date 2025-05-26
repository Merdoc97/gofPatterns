package ua.bot.creation.prototype;

/**
 * The Client class demonstrates how to use the Prototype pattern.
 * It creates initial objects and produces copies of them through cloning.
 */
public class Client {
    
    /**
     * Demonstrates the use of the Prototype pattern.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create prototype instances
        ConcretePrototype1 prototype1 = new ConcretePrototype1("Original Value 1");
        ConcretePrototype2 prototype2 = new ConcretePrototype2(100);
        
        // Create a prototype registry
        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototype("prototype1", prototype1);
        registry.addPrototype("prototype2", prototype2);
        
        // Clone directly from prototypes
        ConcretePrototype1 clone1 = (ConcretePrototype1) prototype1.clone();
        ConcretePrototype2 clone2 = (ConcretePrototype2) prototype2.clone();
        
        // Clone from registry
        ConcretePrototype1 registryClone1 = (ConcretePrototype1) registry.clonePrototype("prototype1");
        ConcretePrototype2 registryClone2 = (ConcretePrototype2) registry.clonePrototype("prototype2");
        
        // Verify the clones are independent copies
        System.out.println("Original prototype1: " + prototype1);
        System.out.println("Cloned prototype1: " + clone1);
        System.out.println("Registry cloned prototype1: " + registryClone1);
        
        System.out.println("\nOriginal prototype2: " + prototype2);
        System.out.println("Cloned prototype2: " + clone2);
        System.out.println("Registry cloned prototype2: " + registryClone2);
        
        // Modify the clones to show they are independent objects
        clone1.setField1("Modified Clone Value 1");
        registryClone1.setField1("Modified Registry Clone Value 1");
        
        clone2.setField2(200);
        registryClone2.setField2(300);
        
        System.out.println("\nAfter modifications:");
        System.out.println("Original prototype1: " + prototype1);
        System.out.println("Cloned prototype1: " + clone1);
        System.out.println("Registry cloned prototype1: " + registryClone1);
        
        System.out.println("\nOriginal prototype2: " + prototype2);
        System.out.println("Cloned prototype2: " + clone2);
        System.out.println("Registry cloned prototype2: " + registryClone2);
    }
}
