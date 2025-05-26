package ua.bot.creation.prototype;

/**
 * ConcretePrototype2 is another concrete implementation of the Prototype interface.
 * It implements the clone method to create a copy of itself.
 */
public class ConcretePrototype2 implements Prototype {
    
    private int field2;
    
    /**
     * Constructor with field initialization.
     * 
     * @param field2 the value for field2
     */
    public ConcretePrototype2(int field2) {
        this.field2 = field2;
    }
    
    /**
     * Copy constructor for cloning.
     * 
     * @param source the object to copy from
     */
    public ConcretePrototype2(ConcretePrototype2 source) {
        this.field2 = source.field2;
    }
    
    /**
     * Clones this object by creating a new instance with the same values.
     * 
     * @return a new ConcretePrototype2 instance with the same field values
     */
    @Override
    public Prototype clone() {
        return new ConcretePrototype2(this);
    }
    
    /**
     * Gets the value of field2.
     * 
     * @return the value of field2
     */
    public int getField2() {
        return field2;
    }
    
    /**
     * Sets the value of field2.
     * 
     * @param field2 the new value for field2
     */
    public void setField2(int field2) {
        this.field2 = field2;
    }
    
    @Override
    public String toString() {
        return "ConcretePrototype2 [field2=" + field2 + "]";
    }
}
