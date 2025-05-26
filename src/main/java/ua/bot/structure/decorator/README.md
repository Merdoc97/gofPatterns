# Decorator Pattern

## Intent
The Decorator pattern allows behavior to be added to individual objects dynamically and transparently, without affecting the behavior of other objects from the same class. It provides a flexible alternative to subclassing for extending functionality.

## Structure
![Decorator Pattern Structure](decorator-pattern.png)

The Decorator pattern consists of these components:

- **Component**: An interface defining the operations that can be altered by decorators.
- **ConcreteComponent**: A class implementing the Component interface, defining an object to which additional responsibilities can be attached.
- **Decorator**: An abstract class that implements the Component interface and contains a reference to a Component object.
- **ConcreteDecorator**: Classes extending the Decorator class to add responsibilities to components.

## When to Use the Decorator Pattern

Use the Decorator pattern when:

1. **You need to add responsibilities to objects dynamically and transparently**: When you want to add functionality to objects without affecting other objects of the same class.

2. **Extension by subclassing is impractical**: When extending functionality through inheritance would lead to an explosion of subclasses to support every combination of behaviors.

3. **You want to keep class responsibilities clean**: When you have a class with core responsibilities and want to separately add optional or supplementary behaviors.

4. **You need to compose behaviors**: When you want to combine multiple behaviors in a flexible and reusable way.

## Real-World Examples

1. **Java I/O Streams**: Java's I/O classes (java.io) extensively use the Decorator pattern with classes like FileInputStream, BufferedInputStream, DataInputStream, etc.

2. **UI Components**: In GUI libraries, decorators might add scrolling, borders, or other visual elements to existing components.

3. **Web Service Layers**: Adding authentication, logging, or transaction management to web service components.

4. **Coffee Shop Ordering System**: A coffee can be decorated with milk, sugar, whipped cream, etc., each adding to the cost and description.

5. **Pizza Toppings**: A pizza order system where various toppings can be added to a basic pizza.

