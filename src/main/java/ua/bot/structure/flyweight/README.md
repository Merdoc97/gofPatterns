# Flyweight Pattern

## Intent
The Flyweight pattern is a structural design pattern that minimizes memory usage by sharing as much data as possible with similar objects. It allows a program to support vast quantities of objects efficiently by sharing common parts of the object state among multiple objects instead of keeping all the data in each object.

## Structure
![Flyweight Pattern Structure](flyweight-pattern.png)

The Flyweight pattern consists of these components:

- **Flyweight**: An interface that defines operations through which flyweights can receive and act on extrinsic state.
- **ConcreteFlyweight**: Implements the Flyweight interface and stores intrinsic state. This state is shared and independent of the flyweight's context.
- **UnsharedConcreteFlyweight**: Not all flyweight objects need to be shared. This class implements the Flyweight interface but doesn't share instances.
- **FlyweightFactory**: Creates and manages flyweight objects, ensuring that flyweights are shared properly. When a client requests a flyweight, the factory either returns an existing instance or creates a new one if none exists.
- **Client**: Maintains references to flyweights and computes or stores the extrinsic state of flyweights.

## When to Use the Flyweight Pattern

Use the Flyweight pattern when:

1. **An application uses a large number of objects**: When the application needs to create a large number of similar objects, which would consume too much memory.

2. **Object state can be divided into intrinsic and extrinsic parts**: When the object's state can be separated into:
   - **Intrinsic state**: Data that's shared among objects and doesn't change.
   - **Extrinsic state**: Data that varies among objects and can be computed or stored externally.

3. **Object identity is not important**: When the objects being used don't need a unique identity and can be replaced with shared objects.

## Key Concepts

### Intrinsic vs. Extrinsic State

- **Intrinsic State**: The data that doesn't change and can be shared among multiple objects. It's stored inside the flyweight object.
- **Extrinsic State**: The data that changes and depends on the flyweight's context. It's stored or computed by client objects and passed to the flyweight when needed.

### Shared vs. Unshared Flyweights

- **Shared Flyweights**: Objects that contain intrinsic state only and can be shared across multiple contexts.
- **Unshared Flyweights**: Objects that might contain some context-dependent state that cannot be shared. Although they implement the same interface, they're not shared.

## Real-World Examples

1. **Text Editors**: Character objects in text editors often use the flyweight pattern to represent individual characters while sharing common formatting properties.

2. **Graphics Systems**: Systems that render large numbers of similar graphical objects (like trees in a forest or tiles in a game) can use flyweights to share common characteristics.

3. **Web Browsers**: Web browsers use flyweights to represent common elements across multiple pages, such as fonts or icons.

4. **Game Development**: Games use flyweights to represent common elements like particles, terrain features, or enemy types.

5. **Caching Systems**: Many caching implementations use principles similar to the flyweight pattern.

## Benefits

- **Reduced Memory Usage**: By sharing common parts, you significantly reduce memory usage when handling large numbers of similar objects.
- **Improved Performance**: Fewer objects means less memory allocation and garbage collection, leading to better performance.
- **Simplified Object Composition**: By extracting extrinsic state, you often get a cleaner design with more straightforward object compositions.

## Drawbacks

- **Increased Complexity**: The pattern adds complexity by splitting state and requiring a factory.
- **Runtime Costs**: Computing extrinsic state might increase runtime costs slightly.
- **Synchronization Concerns**: In a multi-threaded environment, the flyweight factory may need synchronization to avoid creating duplicate shared instances.
