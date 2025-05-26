package ua.bot.behaviour.visitor;

/**
 * The Element interface declares an accept method that takes a visitor as an argument.
 * This method is the entry point for visitors to access element-specific operations.
 */
public interface Element {
    
    /**
     * Accept a visitor to perform operations on this element.
     * 
     * @param visitor the visitor to accept
     */
    void accept(Visitor visitor);
}
