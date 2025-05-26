package ua.bot.behaviour.template;

/**
 * A demonstration of the Template Method Pattern.
 * This class shows how the template method defines an algorithm's
 * structure while letting subclasses provide specific implementations.
 */
public class TemplateMethodPatternDemo {
    
    /**
     * Main method to demonstrate the Template Method Pattern.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Template Method Pattern Demonstration");
        System.out.println("-------------------------------------");
        
        // Create concrete implementations
        AbstractClass classA = new ConcreteClassA();
        AbstractClass classB = new ConcreteClassB();
        
        // Execute the template method on the first implementation
        System.out.println("\nExecuting template method on ConcreteClassA:");
        classA.templateMethod();
        
        // Execute the template method on the second implementation
        System.out.println("\nExecuting template method on ConcreteClassB:");
        classB.templateMethod();
        
        System.out.println("\nKey Points of Template Method Pattern:");
        System.out.println("1. Defines the skeleton of an algorithm, deferring some steps to subclasses");
        System.out.println("2. Ensures that the algorithm's structure stays unchanged while subclasses provide implementation details");
        System.out.println("3. Uses 'Hollywood Principle': 'Don't call us, we'll call you'");
        System.out.println("4. Uses hooks to allow optional customization of the algorithm");
        System.out.println("5. Eliminates code duplication by moving common code to the abstract class");
    }
}
