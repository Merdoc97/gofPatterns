package ua.bot.structure.proxy;

/**
 * The Proxy class implements the same interface as RealSubject,
 * which allows it to be used wherever the RealSubject is expected.
 */
public class Proxy implements Subject {
    /**
     * Reference to the RealSubject. The Proxy maintains a reference to the RealSubject
     * and controls access to it.
     */
    private RealSubject realSubject;

    /**
     * Constructor that initializes the proxy with a reference to the RealSubject.
     */
    public Proxy() {
        // Lazy initialization - the realSubject is created only when needed
    }

    /**
     * The request implementation that may perform additional operations
     * before or after delegating to the RealSubject.
     */
    @Override
    public void request() {
        // Lazy initialization of realSubject
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        
        // Pre-processing can be done here
        System.out.println("Proxy: Pre-processing request...");
        
        // Delegating to the real subject
        realSubject.request();
        
        // Post-processing can be done here
        System.out.println("Proxy: Post-processing request...");
    }
}
