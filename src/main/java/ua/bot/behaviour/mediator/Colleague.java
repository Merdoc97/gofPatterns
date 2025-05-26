package ua.bot.behaviour.mediator;

/**
 * The abstract Colleague class represents components that need to communicate with each other.
 * Each Colleague has a reference to a mediator through which it communicates with other colleagues.
 */
public abstract class Colleague {
    
    protected Mediator mediator;
    
    /**
     * Constructor sets the mediator for this colleague.
     * 
     * @param mediator the mediator that will handle communication
     */
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
