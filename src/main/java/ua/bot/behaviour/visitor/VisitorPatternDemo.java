package ua.bot.behaviour.visitor;

/**
 * A demonstration of the Visitor Pattern.
 * This class shows how to use the visitor pattern to perform operations on elements.
 */
public class VisitorPatternDemo {
    
    /**
     * Main method to demonstrate the Visitor Pattern.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Visitor Pattern Demonstration");
        System.out.println("----------------------------");
        
        // Setup the object structure
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(new ConcreteElementA());
        objectStructure.addElement(new ConcreteElementB());
        
        // Create visitors
        Visitor visitor1 = new ConcreteVisitor1();
        Visitor visitor2 = new ConcreteVisitor2();
        
        // Demonstrate the visitor pattern
        System.out.println("\nUsing ConcreteVisitor1:");
        objectStructure.accept(visitor1);
        
        System.out.println("\nUsing ConcreteVisitor2:");
        objectStructure.accept(visitor2);
        
        // Demonstrate individual element accept
        System.out.println("\nIndividual element accepts:");
        Element elementA = new ConcreteElementA();
        elementA.accept(visitor1);
        
        Element elementB = new ConcreteElementB();
        elementB.accept(visitor2);
        
        System.out.println("\nKey Points of Visitor Pattern:");
        System.out.println("1. Allows adding new operations to existing object structures without modifying them");
        System.out.println("2. Groups related operations in a visitor class");
        System.out.println("3. Accumulates state across the entire object structure");
        System.out.println("4. Enables double dispatch mechanism");
    }
}
