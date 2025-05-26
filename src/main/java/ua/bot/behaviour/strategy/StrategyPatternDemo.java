package ua.bot.behaviour.strategy;

/**
 * A demonstration of the Strategy Pattern.
 * This class shows how to use different strategies at runtime.
 */
public class StrategyPatternDemo {
    
    /**
     * Main method to demonstrate the Strategy Pattern.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Strategy Pattern Demonstration");
        System.out.println("-----------------------------");
        
        // Create concrete strategies
        Strategy strategyA = new ConcreteStrategyA();
        Strategy strategyB = new ConcreteStrategyB();
        Strategy strategyC = new ConcreteStrategyC();
        
        // Create context with initial strategy
        Context context = new Context(strategyA);
        
        // Sample data
        String data = "Hello Strategy Pattern";
        
        // Execute strategy A
        System.out.println("\nUsing Strategy A:");
        String resultA = context.executeStrategy(data);
        System.out.println("Result: " + resultA);
        
        // Change to strategy B and execute
        System.out.println("\nChanging to Strategy B:");
        context.setStrategy(strategyB);
        String resultB = context.executeStrategy(data);
        System.out.println("Result: " + resultB);
        
        // Change to strategy C and execute
        System.out.println("\nChanging to Strategy C:");
        context.setStrategy(strategyC);
        String resultC = context.executeStrategy(data);
        System.out.println("Result: " + resultC);
        
        System.out.println("\nKey Points of Strategy Pattern:");
        System.out.println("1. Defines a family of algorithms, encapsulates each one, and makes them interchangeable");
        System.out.println("2. Lets the algorithm vary independently from clients that use it");
        System.out.println("3. Eliminates conditional statements by using polymorphism");
        System.out.println("4. Promotes the Open/Closed Principle as new strategies can be added without modifying existing code");
        System.out.println("5. Separates the decision of which algorithm to use from its implementation");
    }
}
