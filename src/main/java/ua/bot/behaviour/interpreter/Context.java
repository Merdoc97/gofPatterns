package ua.bot.behaviour.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * The Context class contains the information that will be interpreted.
 * It provides a way to represent the variables and their values.
 */
public class Context {
    
    private Map<String, Boolean> variables;
    
    /**
     * Constructor initializes the variables map.
     */
    public Context() {
        variables = new HashMap<>();
    }
    
    /**
     * Sets a variable with a specific value in the context.
     * 
     * @param variable the name of the variable
     * @param value the boolean value of the variable
     */
    public void setVariable(String variable, boolean value) {
        variables.put(variable, value);
    }
    
    /**
     * Gets the value of a variable from the context.
     * 
     * @param variable the name of the variable
     * @return the boolean value of the variable
     */
    public boolean getVariable(String variable) {
        return variables.getOrDefault(variable, false);
    }
}
