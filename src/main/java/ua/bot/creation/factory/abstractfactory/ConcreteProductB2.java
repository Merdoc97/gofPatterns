package ua.bot.creation.factory.abstractfactory;

/**
 * ConcreteProductB2 is another specific implementation of ProductB.
 * All products from the same family should have similar implementations
 * and be able to collaborate with each other.
 */
public class ConcreteProductB2 implements ProductB {
    
    /**
     * Implements the operation defined in the ProductB interface.
     */
    @Override
    public void operationB() {
        System.out.println("ConcreteProductB2: Performing operation B");
    }
    
    /**
     * Collaboration with a compatible ProductA variant.
     * 
     * @param productA the ProductA to collaborate with
     */
    @Override
    public void collaborateWith(ProductA productA) {
        System.out.println("ConcreteProductB2: Collaborating with " + 
                           productA.getClass().getSimpleName());
        productA.operationA();
    }
}
