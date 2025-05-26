package ua.bot.behaviour.iterator;

/**
 * The Iterator interface declares operations required for traversing a collection.
 *
 * @param <T> the type of elements returned by this iterator
 */
public interface Iterator<T> {
    
    /**
     * Returns true if the iteration has more elements.
     *
     * @return true if the iteration has more elements
     */
    boolean hasNext();
    
    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     */
    T next();
    
    /**
     * Returns the current index of the iterator.
     *
     * @return the current index
     */
    int getCurrentIndex();
}
