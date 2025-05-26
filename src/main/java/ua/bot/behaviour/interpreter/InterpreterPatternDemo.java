package ua.bot.behaviour.interpreter;

/**
 * Demonstration of the Interpreter Pattern.
 * This class shows how to build and use the expression tree.
 */
public class InterpreterPatternDemo {
    
    /**
     * Main method to demonstrate the Interpreter Pattern.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Rule: Robert && (John || Mary)
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        Expression mary = new TerminalExpression("Mary");
        
        Expression johnOrMary = new OrExpression(john, mary);
        Expression robertAndJohnOrMary = new AndExpression(robert, johnOrMary);
        
        // Create different contexts to evaluate the expression
        Context context1 = new Context();
        context1.setVariable("Robert", true);
        context1.setVariable("John", true);
        
        Context context2 = new Context();
        context2.setVariable("Robert", true);
        context2.setVariable("Mary", true);
        
        Context context3 = new Context();
        context3.setVariable("John", true);
        context3.setVariable("Mary", true);
        
        Context context4 = new Context();
        context4.setVariable("Robert", false);
        context4.setVariable("John", true);
        
        // Evaluate the expression with different contexts
        System.out.println("Interpreter Pattern Demonstration");
        System.out.println("-----------------------------------");
        System.out.println("Expression: Robert && (John || Mary)");
        System.out.println("\nContext 1: Robert=true, John=true, Mary=false");
        System.out.println("Result: " + robertAndJohnOrMary.interpret(context1));
        
        System.out.println("\nContext 2: Robert=true, John=false, Mary=true");
        System.out.println("Result: " + robertAndJohnOrMary.interpret(context2));
        
        System.out.println("\nContext 3: Robert=false, John=true, Mary=true");
        System.out.println("Result: " + robertAndJohnOrMary.interpret(context3));
        
        System.out.println("\nContext 4: Robert=false, John=true, Mary=false");
        System.out.println("Result: " + robertAndJohnOrMary.interpret(context4));
        
        // Create a more complex expression: !Robert && (John || !Mary)
        Expression notRobert = new NotExpression(robert);
        Expression notMary = new NotExpression(mary);
        Expression johnOrNotMary = new OrExpression(john, notMary);
        Expression notRobertAndJohnOrNotMary = new AndExpression(notRobert, johnOrNotMary);
        
        System.out.println("\nMore complex expression: !Robert && (John || !Mary)");
        System.out.println("\nContext 1: Robert=true, John=true, Mary=false");
        System.out.println("Result: " + notRobertAndJohnOrNotMary.interpret(context1));
        
        System.out.println("\nContext 2: Robert=true, John=false, Mary=true");
        System.out.println("Result: " + notRobertAndJohnOrNotMary.interpret(context2));
        
        System.out.println("\nContext 3: Robert=false, John=true, Mary=true");
        System.out.println("Result: " + notRobertAndJohnOrNotMary.interpret(context3));
        
        System.out.println("\nContext 4: Robert=false, John=true, Mary=false");
        System.out.println("Result: " + notRobertAndJohnOrNotMary.interpret(context4));
    }
}
