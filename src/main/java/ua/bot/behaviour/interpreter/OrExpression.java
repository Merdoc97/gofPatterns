package ua.bot.behaviour.interpreter;

/**
 * OrExpression is a non-terminal expression that represents 
 * the logical OR operation between two expressions.
 */
public class OrExpression implements Expression {
    
    private Expression expr1;
    private Expression expr2;
    
    /**
     * Constructor takes two expressions to perform OR operation.
     * 
     * @param expr1 the first expression
     * @param expr2 the second expression
     */
    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
    
    /**
     * Interprets by performing logical OR on the results of the two expressions.
     * 
     * @param context the context to interpret
     * @return true if either expression evaluates to true, false otherwise
     */
    @Override
    public boolean interpret(Context context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
