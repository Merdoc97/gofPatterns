package ua.bot.structure.decorator;

/**
 * Demo class that shows how the Decorator pattern works.
 * This demonstrates how decorators can be stacked to add multiple behaviors.
 */
public class DecoratorPatternDemo {
    
    /**
     * Client code that uses the Decorator pattern
     */
    public static void main(String[] args) {
        System.out.println("Decorator Pattern Demonstration");
        System.out.println("------------------------------");
        
        // Create a simple component
        Component simple = new ConcreteComponent();
        System.out.println("1. Simple component:");
        System.out.println(simple.operation());
        
        // Decorate the component with ConcreteDecoratorA
        Component decoratorA = new ConcreteDecoratorA(simple);
        System.out.println("\n2. Component decorated with ConcreteDecoratorA:");
        System.out.println(decoratorA.operation());
        
        // Access decorator-specific method (requires casting)
        ConcreteDecoratorA decoratorAInstance = (ConcreteDecoratorA) decoratorA;
        System.out.println("Additional operation from DecoratorA:");
        System.out.println(decoratorAInstance.additionalOperation());
        
        // Decorate the component with ConcreteDecoratorB
        Component decoratorB = new ConcreteDecoratorB(simple);
        System.out.println("\n3. Component decorated with ConcreteDecoratorB:");
        System.out.println(decoratorB.operation());
        
        // Invoke additional method on DecoratorB
        ((ConcreteDecoratorB) decoratorB).newFeature();
        
        // Decorate the component with ConcreteDecoratorC
        Component decoratorC = new ConcreteDecoratorC(simple);
        System.out.println("\n4. Component decorated with ConcreteDecoratorC:");
        System.out.println(decoratorC.operation());
        
        // Stack multiple decorators
        Component decoratorAB = new ConcreteDecoratorA(new ConcreteDecoratorB(simple));
        System.out.println("\n5. Component decorated with DecoratorB and then DecoratorA:");
        System.out.println(decoratorAB.operation());
        
        // Stack all three decorators
        Component decoratorABC = new ConcreteDecoratorA(
                                 new ConcreteDecoratorB(
                                 new ConcreteDecoratorC(simple)));
        System.out.println("\n6. Component with all three decorators stacked:");
        System.out.println(decoratorABC.operation());
        
        // Different stacking order produces different results
        Component decoratorACB = new ConcreteDecoratorA(
                                new ConcreteDecoratorC(
                                new ConcreteDecoratorB(simple)));
        System.out.println("\n7. Component with different decorator stacking order:");
        System.out.println(decoratorACB.operation());
    }
}
