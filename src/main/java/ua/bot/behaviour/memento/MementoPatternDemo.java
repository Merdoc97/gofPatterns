package ua.bot.behaviour.memento;

/**
 * A demonstration of the Memento Pattern.
 * This class shows how to use the Originator, Memento, and Caretaker
 * to save and restore object states.
 */
public class MementoPatternDemo {
    
    /**
     * Main method to demonstrate the Memento Pattern.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Memento Pattern Demonstration");
        System.out.println("----------------------------");
        
        // Create originator and caretaker
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        
        // Set state and create memento
        originator.setState("State #1");
        caretaker.addMemento(originator.saveStateToMemento());
        
        // Change state and create another memento
        originator.setState("State #2");
        caretaker.addMemento(originator.saveStateToMemento());
        
        // Change state again and create a third memento
        originator.setState("State #3");
        caretaker.addMemento(originator.saveStateToMemento());
        
        // Change state again without creating a memento
        originator.setState("State #4");
        
        // Now restore to previous states
        System.out.println("\nCurrent state: " + originator.getState());
        System.out.println("\nRestoring to previous states:");
        
        // Restore to State #3
        originator.restoreStateFromMemento(caretaker.getMemento(2));
        
        // Restore to State #2
        originator.restoreStateFromMemento(caretaker.getMemento(1));
        
        // Restore to State #1
        originator.restoreStateFromMemento(caretaker.getMemento(0));
        
        System.out.println("\nKey Points of Memento Pattern:");
        System.out.println("1. Captures and externalizes an object's internal state");
        System.out.println("2. Allows the object to be restored to this state later");
        System.out.println("3. Keeps the encapsulation boundaries of the originator");
        System.out.println("4. Prevents other objects from accessing the memento's internal state");
    }
}
