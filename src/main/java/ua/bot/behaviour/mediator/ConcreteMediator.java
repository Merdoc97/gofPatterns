package ua.bot.behaviour.mediator;

/**
 * ConcreteMediator implements the Mediator interface and coordinates communication
 * between colleagues. It knows and maintains its colleagues.
 */
public class ConcreteMediator implements Mediator {
    
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;
    
    /**
     * Sets the first colleague.
     * 
     * @param colleagueA the first colleague
     */
    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }
    
    /**
     * Sets the second colleague.
     * 
     * @param colleagueB the second colleague
     */
    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
    
    /**
     * Implements the notification method from the Mediator interface.
     * This method handles communication between colleagues based on the event.
     * 
     * @param sender the colleague that triggered the event
     * @param event the event that occurred
     */
    @Override
    public void notify(Colleague sender, String event) {
        if (sender == colleagueA && event.equals("A_OPERATION")) {
            System.out.println("Mediator reacts on A_OPERATION and triggers the following operations:");
            colleagueB.receiveMessage("Colleague A performed an operation");
        }
        
        if (sender == colleagueB && event.equals("B_OPERATION")) {
            System.out.println("Mediator reacts on B_OPERATION and triggers the following operations:");
            colleagueA.receiveMessage("Colleague B performed an operation");
        }
    }
}
