package ua.bot.behaviour.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * The ConcreteAggregate class implements the Aggregate interface and
 * provides an implementation of the createIterator method.
 *
 * @param <T> the type of elements in this aggregate
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
    
    private List<T> items;
    
    /**
     * Constructor initializes the items list.
     */
    public ConcreteAggregate() {
        this.items = new ArrayList<>();
    }
    
    /**
     * Adds an item to the aggregate.
     *
     * @param item the item to add
     */
    public void addItem(T item) {
        items.add(item);
    }
    
    /**
     * Gets the item at the specified index.
     *
     * @param index the index of the item to get
     * @return the item at the specified index
     */
    public T getItem(int index) {
        return items.get(index);
    }
    
    /**
     * Gets the number of items in the aggregate.
     *
     * @return the number of items
     */
    public int getCount() {
        return items.size();
    }
    
    /**
     * Creates a new iterator over this aggregate.
     *
     * @return a new concrete iterator instance
     */
    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(this);
    }
}
