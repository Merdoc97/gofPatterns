package ua.bot.behaviour.iterator;

/**
 * A demonstration of the Iterator Pattern.
 * This class shows how to use iterators to traverse a collection.
 */
public class IteratorPatternDemo {
    
    /**
     * Main method to demonstrate the Iterator Pattern.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Iterator Pattern Demonstration");
        System.out.println("------------------------------");
        
        // Create a concrete aggregate and add items
        ConcreteAggregate<String> nameRepository = new ConcreteAggregate<>();
        nameRepository.addItem("John");
        nameRepository.addItem("Jane");
        nameRepository.addItem("Tom");
        nameRepository.addItem("Lisa");
        nameRepository.addItem("Mark");
        
        // Create an iterator
        Iterator<String> iterator = nameRepository.createIterator();
        
        // Use the iterator to traverse the collection
        System.out.println("\nTraversing the collection using the iterator:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name at index " + (iterator.getCurrentIndex() - 1) + ": " + name);
        }
        
        // Create a different collection
        ConcreteAggregate<Integer> numberRepository = new ConcreteAggregate<>();
        numberRepository.addItem(100);
        numberRepository.addItem(200);
        numberRepository.addItem(300);
        
        // Create an iterator for the number collection
        Iterator<Integer> numberIterator = numberRepository.createIterator();
        
        // Use the iterator to traverse the collection
        System.out.println("\nTraversing a different collection using the iterator:");
        while (numberIterator.hasNext()) {
            Integer number = numberIterator.next();
            System.out.println("Number at index " + (numberIterator.getCurrentIndex() - 1) + ": " + number);
        }
        
        System.out.println("\nKey Points of Iterator Pattern:");
        System.out.println("1. Provides a way to access elements sequentially without exposing the underlying structure");
        System.out.println("2. Decouples algorithms from container objects");
        System.out.println("3. Allows for multiple traversals of a collection");
        System.out.println("4. Simplifies the interface of the aggregate");
        System.out.println("5. Supports different types of traversals");
    }
}
