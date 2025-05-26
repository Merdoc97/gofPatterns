package ua.bot.behaviour.interpreter;

/**
 * AndExpression is a non-terminal expression that represents 
 * the logical AND operation between two expressions.
 */
public class AndExpression implements Expression {
    
    private Expression expr1;
    private Expression expr2;
    
    /**
     * Constructor takes two expressions to perform AND operation.
     * 
     * @param expr1 the first expression
     * @param expr2 the second expression
     */
    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
    
    /**
     * Interprets by performing logical AND on the results of the two expressions.
     * 
     * @param context the context to interpret
     * @return true if both expressions evaluate to true, false otherwise
     */
    @Override
    public boolean interpret(Context context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
