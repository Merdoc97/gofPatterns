package ua.bot.behaviour.interpreter;

/**
 * TerminalExpression is a leaf node in the expression tree.
 * It implements the interpret operation for terminal symbols in the grammar.
 */
public class TerminalExpression implements Expression {
    
    private String variable;
    
    /**
     * Constructor stores the variable name.
     * 
     * @param variable the variable name
     */
    public TerminalExpression(String variable) {
        this.variable = variable;
    }
    
    /**
     * Interprets the context by retrieving the value of the variable.
     * 
     * @param context the context to interpret
     * @return the value of the variable from the context
     */
    @Override
    public boolean interpret(Context context) {
        return context.getVariable(variable);
    }
}
