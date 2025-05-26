# Bridge Pattern

## Intent
The Bridge pattern decouples an abstraction from its implementation so that the two can vary independently. It involves an interface acting as a bridge between the abstract class and implementor classes, enabling the functionality of both to evolve independently.

## Structure
![Bridge Pattern Structure](bridge-pattern.png)

The Bridge pattern consists of these components:

- **Abstraction**: Defines the abstraction's interface and maintains a reference to an object of type Implementor.
- **RefinedAbstraction**: Extends the interface defined by Abstraction to provide more specialized functionality.
- **Implementor**: Defines the interface for implementation classes. This interface doesn't need to correspond exactly to Abstraction's interface.
- **ConcreteImplementor**: Implements the Implementor interface and defines concrete implementations.

## When to Use the Bridge Pattern

Use the Bridge pattern when:

1. **You want to avoid a permanent binding between an abstraction and its implementation**: The Bridge pattern allows you to switch implementations at runtime.

2. **Both the abstractions and their implementations should be extensible through subclasses**: The Bridge pattern lets you combine the different abstractions and implementations and extend them independently.

3. **Changes in the implementation should not impact the client code**: The Bridge pattern hides implementation details from the client code.

4. **You have a proliferation of classes**: The Bridge pattern prevents an exponential increase in the number of classes as the system grows.

5. **You want to share an implementation among multiple objects**: The Bridge pattern allows an implementation to be shared among multiple objects.

## Real-World Examples

1. **GUI Frameworks**: A window abstraction can be implemented differently on Windows, macOS, or Linux platforms.

2. **Device Drivers**: Different hardware devices with a common interface can be accessed through various driver implementations.

3. **Database Connectors**: A database client abstraction can work with various database implementations (MySQL, PostgreSQL, Oracle).

4. **Rendering Engines**: Different rendering engines (software-based, hardware-accelerated) can be used to render the same graphical elements.

5. **Remote Controls**: A remote control (abstraction) can work with different devices (implementations).
