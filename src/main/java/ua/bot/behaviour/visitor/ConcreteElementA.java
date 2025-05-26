package ua.bot.behaviour.visitor;

/**
 * ConcreteElementA implements the Element interface and defines the accept operation.
 * It also provides an operation that the visitor can use.
 */
public class ConcreteElementA implements Element {
    
    /**
     * Accept a visitor by calling its visitConcreteElementA method.
     * 
     * @param visitor the visitor to accept
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
    
    /**
     * An operation specific to ConcreteElementA that visitors can use.
     * 
     * @return a result string from the operation
     */
    public String operationA() {
        return "ElementA Data";
    }
}
