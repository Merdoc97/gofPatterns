package ua.bot.behaviour.visitor;

/**
 * The Visitor interface declares a set of visiting methods for each concrete element class.
 * The visitor's methods correspond to the element classes.
 */
public interface Visitor {
    
    /**
     * Visit ConcreteElementA.
     * 
     * @param element the ConcreteElementA to visit
     */
    void visitConcreteElementA(ConcreteElementA element);
    
    /**
     * Visit ConcreteElementB.
     * 
     * @param element the ConcreteElementB to visit
     */
    void visitConcreteElementB(ConcreteElementB element);
}
