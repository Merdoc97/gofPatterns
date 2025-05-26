package ua.bot.structure.facade;

/**
 * SubsystemB represents another part of the complex subsystem.
 * This class provides different functionality than SubsystemA.
 */
public class SubsystemB {
    
    /**
     * Performs an operation specific to SubsystemB.
     * In a real application, this would contain complex logic.
     */
    public void operationB() {
        System.out.println("SubsystemB: Performing operation B");
        // Complex operation details would go here
    }
    
    /**
     * Prepares data for processing in SubsystemB.
     * 
     * @param data the data to prepare
     * @return the prepared data
     */
    public String prepareData(String data) {
        System.out.println("SubsystemB: Preparing data - " + data);
        // Data preparation logic would go here
        return "Prepared " + data;
    }
    
    /**
     * Processes the data in SubsystemB.
     * 
     * @param data the data to process
     */
    public void processData(String data) {
        System.out.println("SubsystemB: Processing data - " + data);
        // Data processing logic would go here
    }
}
