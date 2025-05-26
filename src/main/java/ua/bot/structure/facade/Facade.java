package ua.bot.structure.facade;

/**
 * The Facade class provides a simplified interface to a complex subsystem.
 * It delegates client requests to appropriate subsystem objects and manages their lifecycle.
 */
public class Facade {
    
    private final SubsystemA subsystemA;
    private final SubsystemB subsystemB;
    private final SubsystemC subsystemC;
    
    /**
     * Constructor that initializes all required subsystems.
     */
    public Facade() {
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
        this.subsystemC = new SubsystemC();
    }
    
    /**
     * Provides a simplified interface for starting the system.
     * This method handles the initialization of all subsystems.
     */
    public void startSystem() {
        System.out.println("Facade: Starting the system");
        subsystemA.initialize();
        // Other initialization could go here
    }
    
    /**
     * Provides a simplified interface for processing data.
     * This method coordinates the interactions between subsystems.
     * 
     * @param data the input data to process
     * @return the processed result
     */
    public String processData(String data) {
        System.out.println("Facade: Processing data through the subsystems");
        
        // Use SubsystemA
        subsystemA.operationA();
        
        // Use SubsystemB
        String preparedData = subsystemB.prepareData(data);
        subsystemB.processData(preparedData);
        subsystemB.operationB();
        
        // Use SubsystemC
        subsystemC.operationC();
        boolean isValid = subsystemC.validateResult(preparedData);
        
        if (isValid) {
            return subsystemC.generateReport();
        } else {
            return "Processing failed";
        }
    }
    
    /**
     * Provides a simplified interface for shutting down the system.
     * This method handles the proper shutdown of all subsystems.
     */
    public void stopSystem() {
        System.out.println("Facade: Stopping the system");
        subsystemA.shutdown();
        // Other shutdown operations could go here
    }
}
