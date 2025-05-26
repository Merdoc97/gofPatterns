package ua.bot.behaviour.interpreter;

/**
 * NotExpression is a non-terminal expression that represents 
 * the logical NOT operation on an expression.
 */
public class NotExpression implements Expression {
    
    private Expression expr;
    
    /**
     * Constructor takes an expression to perform NOT operation.
     * 
     * @param expr the expression to negate
     */
    public NotExpression(Expression expr) {
        this.expr = expr;
    }
    
    /**
     * Interprets by performing logical NOT on the result of the expression.
     * 
     * @param context the context to interpret
     * @return true if the expression evaluates to false, false otherwise
     */
    @Override
    public boolean interpret(Context context) {
        return !expr.interpret(context);
    }
}
