package ua.bot.behaviour.mediator;

/**
 * ConcreteColleagueA is a specific implementation of Colleague.
 * It provides its own operations and notifications via the mediator.
 */
public class ConcreteColleagueA extends Colleague {
    
    /**
     * Constructor passes the mediator to the parent class.
     * 
     * @param mediator the mediator for communication
     */
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }
    
    /**
     * An operation specific to ConcreteColleagueA.
     * After completing the operation, it notifies the mediator.
     */
    public void operation() {
        System.out.println("Colleague A performs an operation");
        mediator.notify(this, "A_OPERATION");
    }
    
    /**
     * Receives a message from another colleague via the mediator.
     * 
     * @param message the message to receive
     */
    public void receiveMessage(String message) {
        System.out.println("Colleague A received message: " + message);
    }
}
