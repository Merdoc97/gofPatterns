package ua.bot.behaviour.iterator;

/**
 * The Aggregate interface declares a method for creating an iterator.
 *
 * @param <T> the type of elements in the aggregate
 */
public interface Aggregate<T> {
    
    /**
     * Creates an iterator over the elements in this aggregate.
     *
     * @return a new iterator instance
     */
    Iterator<T> createIterator();
}
