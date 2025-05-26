package ua.bot.behaviour.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * ObjectStructure maintains a collection of elements and provides a high-level interface
 * to allow visitors to visit its elements.
 */
public class ObjectStructure {
    
    private List<Element> elements = new ArrayList<>();
    
    /**
     * Add an element to the structure.
     * 
     * @param element the element to add
     */
    public void addElement(Element element) {
        elements.add(element);
    }
    
    /**
     * Remove an element from the structure.
     * 
     * @param element the element to remove
     */
    public void removeElement(Element element) {
        elements.remove(element);
    }
    
    /**
     * Accept a visitor for all elements in the structure.
     * 
     * @param visitor the visitor to accept
     */
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
