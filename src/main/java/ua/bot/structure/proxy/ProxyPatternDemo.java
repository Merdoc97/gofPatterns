package ua.bot.structure.proxy;

/**
 * Demo class that shows how the Proxy pattern works.
 */
public class ProxyPatternDemo {
    
    public static void main(String[] args) {
        System.out.println("Proxy Pattern Demonstration");
        System.out.println("---------------------------");
        
        // Using the proxy
        System.out.println("Client: Executing the client code with a proxy:");
        Subject proxy = new Proxy();
        proxy.request();
        
        System.out.println("\nClient: Executing the client code with a proxy again:");
        proxy.request(); // Notice that RealSubject is already created (lazy loading)
        
        System.out.println("\nClient: Executing the client code with the real subject directly:");
        Subject realSubject = new RealSubject();
        realSubject.request();
    }
}
