package ua.bot.structure.proxy;

/**
 * RealSubject defines the real object that the proxy represents.
 */
public class RealSubject implements Subject {
    /**
     * Implementation of the request operation.
     * This is the actual functionality that might be resource-intensive
     * or need access control via the Proxy.
     */
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request...");
        // The real, resource-intensive operation happens here
    }
}
