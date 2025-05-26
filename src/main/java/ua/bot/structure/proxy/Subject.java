package ua.bot.structure.proxy;

/**
 * The Subject interface defines the common interface for RealSubject and Proxy
 * so that a Proxy can be used anywhere a RealSubject is expected.
 */
public interface Subject {
    /**
     * The request method that both RealSubject and Proxy will implement.
     */
    void request();
}
