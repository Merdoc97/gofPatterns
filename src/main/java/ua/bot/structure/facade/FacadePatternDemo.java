package ua.bot.structure.facade;

/**
 * Demo class that shows how the Facade pattern works.
 * This demonstrates how the client code interacts with the Facade
 * instead of directly with the subsystems.
 */
public class FacadePatternDemo {
    
    /**
     * Client code that uses the Facade pattern
     */
    public static void main(String[] args) {
        System.out.println("Facade Pattern Demonstration");
        System.out.println("---------------------------");
        
        // Create the facade
        Facade facade = new Facade();
        
        // Client code only interacts with the Facade, not with the subsystems
        // The complexity is hidden behind the Facade's simple interface
        facade.startSystem();
        
        String result = facade.processData("Sample Data");
        System.out.println("Result: " + result);
        
        facade.stopSystem();
        
        System.out.println("\nWithout Facade (Complex Interaction):");
        System.out.println("-----------------------------------");
        
        // Without Facade, client would need to interact with each subsystem directly
        // This demonstrates the complexity that the Facade hides
        SubsystemA subsystemA = new SubsystemA();
        SubsystemB subsystemB = new SubsystemB();
        SubsystemC subsystemC = new SubsystemC();
        
        subsystemA.initialize();
        subsystemA.operationA();
        
        String preparedData = subsystemB.prepareData("Sample Data");
        subsystemB.processData(preparedData);
        subsystemB.operationB();
        
        subsystemC.operationC();
        boolean isValid = subsystemC.validateResult(preparedData);
        
        if (isValid) {
            String report = subsystemC.generateReport();
            System.out.println("Result: " + report);
        }
        
        subsystemA.shutdown();
    }
}
