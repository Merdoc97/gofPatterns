package ua.bot.behaviour.iterator;

/**
 * The ConcreteIterator class implements the Iterator interface and
 * provides a specific implementation of the iteration algorithm.
 *
 * @param <T> the type of elements returned by this iterator
 */
public class ConcreteIterator<T> implements Iterator<T> {
    
    private ConcreteAggregate<T> aggregate;
    private int currentIndex = 0;
    
    /**
     * Constructor takes the aggregate to iterate over.
     *
     * @param aggregate the aggregate to iterate over
     */
    public ConcreteIterator(ConcreteAggregate<T> aggregate) {
        this.aggregate = aggregate;
    }
    
    /**
     * Checks if there are more elements to iterate.
     *
     * @return true if there are more elements
     */
    @Override
    public boolean hasNext() {
        return currentIndex < aggregate.getCount();
    }
    
    /**
     * Gets the next element in the iteration.
     *
     * @return the next element
     */
    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }
        
        T item = aggregate.getItem(currentIndex);
        currentIndex++;
        return item;
    }
    
    /**
     * Gets the current index of the iterator.
     *
     * @return the current index
     */
    @Override
    public int getCurrentIndex() {
        return currentIndex;
    }
}
