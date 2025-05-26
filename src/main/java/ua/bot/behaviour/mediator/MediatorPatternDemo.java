package ua.bot.behaviour.mediator;

/**
 * A demonstration of the Mediator Pattern.
 * This class shows how colleagues communicate through a mediator.
 */
public class MediatorPatternDemo {
    
    /**
     * Main method to demonstrate the Mediator Pattern.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Mediator Pattern Demonstration");
        System.out.println("------------------------------");
        
        // Create the mediator
        ConcreteMediator mediator = new ConcreteMediator();
        
        // Create colleagues with reference to the mediator
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);
        
        // Register colleagues with the mediator
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);
        
        // Demonstrate communication via the mediator
        System.out.println("\nWhen Colleague A performs an operation:");
        colleagueA.operation();
        
        System.out.println("\nWhen Colleague B performs an operation:");
        colleagueB.operation();
        
        System.out.println("\nKey Points of Mediator Pattern:");
        System.out.println("1. Reduces coupling between components by eliminating direct connections");
        System.out.println("2. Centralizes communication logic in the mediator");
        System.out.println("3. Simplifies object protocols");
        System.out.println("4. Makes object interaction more reusable");
    }
}
