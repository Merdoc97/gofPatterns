package ua.bot.behaviour.mediator;

/**
 * ConcreteColleagueB is another specific implementation of Colleague.
 * It provides its own operations and notifications via the mediator.
 */
public class ConcreteColleagueB extends Colleague {
    
    /**
     * Constructor passes the mediator to the parent class.
     * 
     * @param mediator the mediator for communication
     */
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }
    
    /**
     * An operation specific to ConcreteColleagueB.
     * After completing the operation, it notifies the mediator.
     */
    public void operation() {
        System.out.println("Colleague B performs an operation");
        mediator.notify(this, "B_OPERATION");
    }
    
    /**
     * Receives a message from another colleague via the mediator.
     * 
     * @param message the message to receive
     */
    public void receiveMessage(String message) {
        System.out.println("Colleague B received message: " + message);
    }
}
