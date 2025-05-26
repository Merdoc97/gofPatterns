package ua.bot.behaviour.observer;

/**
 * A demonstration of the Observer Pattern.
 * This class shows how observers are notified when the subject's state changes.
 */
public class ObserverPatternDemo {
    
    /**
     * Main method to demonstrate the Observer Pattern.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Observer Pattern Demonstration");
        System.out.println("-----------------------------");
        
        // Create subject
        ConcreteSubject subject = new ConcreteSubject();
        
        // Create observers
        Observer observerA1 = new ConcreteObserverA("Observer A1");
        Observer observerA2 = new ConcreteObserverA("Observer A2");
        Observer observerB = new ConcreteObserverB("Observer B");
        
        // Attach observers to subject
        System.out.println("\nAttaching observers to subject:");
        subject.attach(observerA1);
        subject.attach(observerA2);
        subject.attach(observerB);
        
        // Change subject state
        System.out.println("\nChanging subject state to 'State 1':");
        subject.setState("State 1");
        
        // Detach an observer
        System.out.println("\nDetaching " + observerA2.getName() + " from subject:");
        subject.detach(observerA2);
        
        // Change subject state again
        System.out.println("\nChanging subject state to 'State 2':");
        subject.setState("State 2");
        
        // Try setting the same state (should not notify)
        System.out.println("\nChanging subject state to 'State 2' again:");
        subject.setState("State 2");
        
        System.out.println("\nKey Points of Observer Pattern:");
        System.out.println("1. Defines a one-to-many dependency between objects");
        System.out.println("2. When a subject changes state, all its observers are notified automatically");
        System.out.println("3. Promotes loose coupling between subjects and observers");
        System.out.println("4. Supports broadcast communication");
        System.out.println("5. Follows the 'Open/Closed Principle' as new observers can be added without modifying the subject");
    }
}
