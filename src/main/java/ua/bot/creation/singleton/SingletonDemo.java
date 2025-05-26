package ua.bot.creation.singleton;

/**
 * A demonstration of various Singleton pattern implementations.
 */
public class SingletonDemo {
    
    /**
     * Main method to demonstrate the Singleton pattern.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Singleton Pattern Demonstration");
        System.out.println("-------------------------------");
        
        // Demonstrate Lazy Singleton
        System.out.println("\n1. Lazy Singleton:");
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        lazySingleton1.operation();
        
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println("Are the instances same? " + (lazySingleton1 == lazySingleton2));
        
        // Demonstrate Thread-Safe Singleton
        System.out.println("\n2. Thread-Safe Singleton:");
        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        threadSafeSingleton1.operation();
        
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();
        System.out.println("Are the instances same? " + (threadSafeSingleton1 == threadSafeSingleton2));
        
        // Demonstrate Eager Singleton
        System.out.println("\n3. Eager Singleton:");
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        eagerSingleton1.operation();
        
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println("Are the instances same? " + (eagerSingleton1 == eagerSingleton2));
        
        // Demonstrate Enum Singleton
        System.out.println("\n4. Enum Singleton:");
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        enumSingleton1.operation();
        
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println("Are the instances same? " + (enumSingleton1 == enumSingleton2));
        
        System.out.println("\nKey Points of Singleton Pattern:");
        System.out.println("1. Ensures a class has only one instance");
        System.out.println("2. Provides a global point of access to that instance");
        System.out.println("3. Controls instantiation through private constructors");
        System.out.println("4. Has different implementations for different needs (lazy, eager, thread-safe, enum)");
    }
}
