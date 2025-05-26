package ua.bot.behaviour.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * The Caretaker is responsible for keeping track of multiple mementos.
 * It stores mementos but never modifies them or operates on their contents.
 */
public class Caretaker {
    
    private List<Memento> mementos = new ArrayList<>();
    
    /**
     * Adds a memento to the caretaker's list.
     * 
     * @param memento the memento to add
     */
    public void addMemento(Memento memento) {
        mementos.add(memento);
        System.out.println("Caretaker: Saving state #" + mementos.size());
    }
    
    /**
     * Gets a memento from the caretaker's list.
     * 
     * @param index the index of the memento to retrieve
     * @return the memento at the specified index
     */
    public Memento getMemento(int index) {
        System.out.println("Caretaker: Retrieving state #" + (index + 1));
        return mementos.get(index);
    }
    
    /**
     * Gets the total number of mementos stored.
     * 
     * @return the number of mementos
     */
    public int getMementoCount() {
        return mementos.size();
    }
}
