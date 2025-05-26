package ua.bot.behaviour.template;

/**
 * ConcreteClassB provides alternative implementations for the abstract
 * operations defined in AbstractClass.
 */
public class ConcreteClassB extends AbstractClass {
    
    /**
     * Implements the first step of the algorithm.
     */
    @Override
    protected void step1() {
        System.out.println("ConcreteClassB: Implementation of Step 1");
    }
    
    /**
     * Implements the second step of the algorithm.
     */
    @Override
    protected void step2() {
        System.out.println("ConcreteClassB: Implementation of Step 2");
    }
    
    /**
     * Implements the fourth step of the algorithm.
     */
    @Override
    protected void step4() {
        System.out.println("ConcreteClassB: Implementation of Step 4");
    }
    
    // Note: ConcreteClassB does not override the hook method,
    // so the default (empty) implementation from AbstractClass is used
}
