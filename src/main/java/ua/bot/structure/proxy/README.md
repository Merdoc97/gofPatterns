# Proxy Pattern

## Intent
The Proxy pattern provides a surrogate or placeholder for another object to control access to it. It creates a representative object that controls access to another object, which may be remote, expensive to create, or in need of securing.

## Structure
![Proxy Pattern Structure](proxy-pattern.png)

The Proxy pattern consists of these components:

- **Subject**: An interface that defines common operations for both the RealSubject and the Proxy.
- **RealSubject**: The real object that the proxy represents. It defines the core functionality that the proxy controls access to.
- **Proxy**: Maintains a reference to the RealSubject and implements the same interface as the RealSubject. The Proxy controls access to the RealSubject and may be responsible for creating and deleting it.

## When to Use the Proxy Pattern

Use the Proxy pattern when you need to:

1. **Control access to another object**: The Proxy can determine if and when the client should be able to access the RealSubject.

2. **Defer the full cost of creating an expensive object**: When an object is expensive to create, the Proxy can create it only when it's needed (lazy initialization).

3. **Add additional behavior when accessing an object**: The Proxy can perform additional operations when an object is accessed (e.g., logging, caching).

