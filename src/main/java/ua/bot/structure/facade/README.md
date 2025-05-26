# Facade Pattern

## Intent
The Facade pattern provides a unified and simplified interface to a complex subsystem of classes, making the subsystem easier to use. It defines a higher-level interface that makes the subsystem more accessible and hides its complexities from clients.

## Structure
![Facade Pattern Structure](facade-pattern.png)

The Facade pattern consists of these components:

- **Facade**: Provides a simple interface to the complex subsystem. It delegates client requests to appropriate objects within the subsystem and manages their lifecycle.
- **Subsystems**: Implement specialized functionality and handle work assigned by the Facade. Subsystems are not aware of the Facade and contain no references to it.
- **Client**: Uses the Facade instead of directly accessing the subsystem objects.

## When to Use the Facade Pattern

Use the Facade pattern when:

1. **You need a simplified interface to a complex subsystem**: When you want to provide a simple interface to a complex system of components.

2. **There are many dependencies between clients and implementation classes**: When you want to decouple a subsystem from its clients and other subsystems, thereby promoting subsystem independence and portability.

3. **You want to layer your subsystems**: When you want to define an entry point to each subsystem level and make them communicate only through their facades.

4. **You need to structure a system into layers**: When you're building a layered architecture and need clear boundaries between layers.

## Real-World Examples

1. **Computer System**: The power button on a computer is a facade for the complex process of booting up the operating system, initializing hardware, and loading startup programs.

2. **Home Theater**: A "Watch Movie" button on a universal remote might be a facade that turns on the TV, sound system, DVD player, and sets them all to the right inputs.

3. **Web Service Facades**: In enterprise applications, facades are often used to provide a simpler interface to complex backend systems.

4. **Libraries and Frameworks**: Many libraries and frameworks use facades to provide simpler interfaces to complex functionality.

5. **Banking Systems**: A banking app provides a simple interface to a complex banking system with multiple subsystems for accounts, loans, investments, etc.

