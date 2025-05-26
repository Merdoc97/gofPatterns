package ua.bot.behaviour.interpreter;

/**
 * The Expression interface declares an interpret method which all
 * concrete expressions must implement. This is the abstract expression.
 */
public interface Expression {
    
    /**
     * Interprets the given context and returns the result.
     * 
     * @param context the context to interpret
     * @return true if the expression evaluates to true for the given context, false otherwise
     */
    boolean interpret(Context context);
}
