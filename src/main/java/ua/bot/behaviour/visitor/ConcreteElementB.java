package ua.bot.behaviour.visitor;

/**
 * ConcreteElementB implements the Element interface and defines the accept operation.
 * It also provides an operation that the visitor can use.
 */
public class ConcreteElementB implements Element {
    
    /**
     * Accept a visitor by calling its visitConcreteElementB method.
     * 
     * @param visitor the visitor to accept
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
    
    /**
     * An operation specific to ConcreteElementB that visitors can use.
     * 
     * @return a result string from the operation
     */
    public String operationB() {
        return "ElementB Data";
    }
}
