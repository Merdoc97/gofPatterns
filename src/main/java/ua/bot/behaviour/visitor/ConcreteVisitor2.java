package ua.bot.behaviour.visitor;

/**
 * ConcreteVisitor2 implements the Visitor interface and defines a different set of operations
 * to be performed on the elements of the object structure.
 * Each concrete visitor implements a different algorithm.
 */
public class ConcreteVisitor2 implements Visitor {
    
    /**
     * Visit ConcreteElementA and perform specific operations on it.
     * 
     * @param element the ConcreteElementA to visit
     */
    @Override
    public void visitConcreteElementA(ConcreteElementA element) {
        System.out.println("ConcreteVisitor2: Visiting " + element.getClass().getSimpleName());
        System.out.println("ConcreteVisitor2: Performing different operation on " + element.operationA());
    }
    
    /**
     * Visit ConcreteElementB and perform specific operations on it.
     * 
     * @param element the ConcreteElementB to visit
     */
    @Override
    public void visitConcreteElementB(ConcreteElementB element) {
        System.out.println("ConcreteVisitor2: Visiting " + element.getClass().getSimpleName());
        System.out.println("ConcreteVisitor2: Performing different operation on " + element.operationB());
    }
}
