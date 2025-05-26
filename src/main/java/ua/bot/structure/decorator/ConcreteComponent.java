package ua.bot.structure.decorator;

/**
 * The ConcreteComponent class implements the Component interface.
 * This is the basic object that can be decorated with additional behavior.
 */
public class ConcreteComponent implements Component {
    
    /**
     * Implements the basic operation.
     * 
     * @return a basic result string
     */
    @Override
    public String operation() {
        return "ConcreteComponent";
    }
}
