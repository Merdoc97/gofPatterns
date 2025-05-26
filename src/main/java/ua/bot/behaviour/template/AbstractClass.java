package ua.bot.behaviour.template;

/**
 * The AbstractClass defines a template method that contains the skeleton
 * of an algorithm. The template method calls primitive operations which
 * subclasses must implement, as well as operations that are already
 * implemented in the abstract class.
 */
public abstract class AbstractClass {
    
    /**
     * The template method defines the skeleton of an algorithm.
     * It calls primitive operations which subclasses must implement,
     * as well as operations already implemented in the abstract class.
     * The template method is typically marked as final to prevent
     * subclasses from changing the algorithm structure.
     */
    public final void templateMethod() {
        // First step
        step1();
        
        // Second step
        step2();
        
        // Optional hook - may be overridden by subclasses
        hook();
        
        // Third step - common implementation
        step3();
        
        // Fourth step
        step4();
    }
    
    /**
     * Required operation - subclasses must implement this.
     */
    protected abstract void step1();
    
    /**
     * Required operation - subclasses must implement this.
     */
    protected abstract void step2();
    
    /**
     * Common implementation shared by all subclasses.
     */
    protected void step3() {
        System.out.println("AbstractClass: Step 3 (common implementation)");
    }
    
    /**
     * Required operation - subclasses must implement this.
     */
    protected abstract void step4();
    
    /**
     * Hook method with a default implementation.
     * Subclasses may override this method but it's not mandatory.
     */
    protected void hook() {
        // Default implementation does nothing
    }
}
