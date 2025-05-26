# Adapter Pattern

## Intent
The Adapter pattern allows objects with incompatible interfaces to collaborate. It converts the interface of a class into another interface that clients expect, enabling classes to work together that couldn't otherwise due to incompatible interfaces.

## Structure
![Adapter Pattern Structure](adapter-pattern.png)

The Adapter pattern consists of these components:

- **Target**: The interface that clients use and expect.
- **Adaptee**: The class that needs to be adapted to work with the client code.
- **Adapter**: The class that adapts the Adaptee to the Target interface.
- **Client**: The class that collaborates with objects conforming to the Target interface.

## Types of Adapters

There are two main variants of the Adapter pattern:

1. **Object Adapter**: Uses composition by referencing an instance of the Adaptee inside the Adapter.
2. **Class Adapter**: Uses inheritance by extending the Adaptee class and implementing the Target interface.

## When to Use the Adapter Pattern

Use the Adapter pattern when:

1. **You want to use an existing class, but its interface doesn't match the one you need**: The Adapter pattern allows classes with incompatible interfaces to work together.

2. **You want to reuse existing subclasses that lack certain common functionality that can't be added to the superclass**: The Object Adapter lets you adapt the interface of its parent class.

3. **You need to integrate classes that weren't designed to work together**: When integrating third-party libraries or legacy code with incompatible interfaces.

4. **You want to create a reusable class that cooperates with classes that don't necessarily have compatible interfaces**: The Adapter makes your class compatible with other interfaces.

## Real-World Examples

1. **Power Adapters**: Different countries have different electrical outlets and voltages. Power adapters convert one type of plug and voltage to another.

2. **Legacy System Integration**: Adapting a legacy system's API to work with modern code.

3. **Framework Adapters**: Adapting third-party libraries to fit into your application's architecture.

4. **Database Adapters**: Adapting different database drivers to a common interface.

5. **Memory Card Readers**: Card readers that adapt various memory card formats to the USB interface.

