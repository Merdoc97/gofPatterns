package ua.bot.creation.prototype;

/**
 * ConcretePrototype1 is a concrete implementation of the Prototype interface.
 * It implements the clone method to create a copy of itself.
 */
public class ConcretePrototype1 implements Prototype {
    
    private String field1;
    
    /**
     * Constructor with field initialization.
     * 
     * @param field1 the value for field1
     */
    public ConcretePrototype1(String field1) {
        this.field1 = field1;
    }
    
    /**
     * Copy constructor for cloning.
     * 
     * @param source the object to copy from
     */
    public ConcretePrototype1(ConcretePrototype1 source) {
        this.field1 = source.field1;
    }
    
    /**
     * Clones this object by creating a new instance with the same values.
     * 
     * @return a new ConcretePrototype1 instance with the same field values
     */
    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this);
    }
    
    /**
     * Gets the value of field1.
     * 
     * @return the value of field1
     */
    public String getField1() {
        return field1;
    }
    
    /**
     * Sets the value of field1.
     * 
     * @param field1 the new value for field1
     */
    public void setField1(String field1) {
        this.field1 = field1;
    }
    
    @Override
    public String toString() {
        return "ConcretePrototype1 [field1=" + field1 + "]";
    }
}
