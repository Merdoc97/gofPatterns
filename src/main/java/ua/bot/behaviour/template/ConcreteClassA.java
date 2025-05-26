package ua.bot.behaviour.template;

/**
 * ConcreteClassA provides specific implementations for the abstract
 * operations defined in AbstractClass.
 */
public class ConcreteClassA extends AbstractClass {
    
    /**
     * Implements the first step of the algorithm.
     */
    @Override
    protected void step1() {
        System.out.println("ConcreteClassA: Implementation of Step 1");
    }
    
    /**
     * Implements the second step of the algorithm.
     */
    @Override
    protected void step2() {
        System.out.println("ConcreteClassA: Implementation of Step 2");
    }
    
    /**
     * Implements the fourth step of the algorithm.
     */
    @Override
    protected void step4() {
        System.out.println("ConcreteClassA: Implementation of Step 4");
    }
    
    /**
     * Override the hook method with a specific implementation.
     */
    @Override
    protected void hook() {
        System.out.println("ConcreteClassA: Overridden Hook");
    }
}
