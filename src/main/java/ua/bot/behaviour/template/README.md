# Template Method Pattern

## Intent
The Template Method pattern is a behavioral design pattern that defines the skeleton of an algorithm in a method in an abstract class, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure. The pattern ensures that the overall algorithm structure remains unchanged while allowing subclasses to override specific steps of the algorithm without changing its structure. This enforces a set of constraints while providing flexibility in how individual steps are implemented.

## Types of Template Method Pattern

1. **Classic Template Method**: The traditional implementation with a single template method containing a sequence of steps, some of which are implemented in the abstract class and others deferred to subclasses through abstract methods.

2. **Template Method with Hooks**: Extends the classic pattern by adding hook methods that provide default implementations but can be overridden by subclasses to customize behavior without being required to do so.

3. **Behavioral Extension Template Method**: Uses a set of pre-defined behaviors that can be selected and combined by subclasses, with the template method orchestrating these behaviors.

4. **Composite Template Method**: Multiple template methods that work together, with some template methods calling others to create complex algorithm structures.

5. **Parameterized Template Method**: Accepts parameters that influence how the algorithm is executed, allowing for more dynamic behavior.

6. **Factory Template Method**: Combines the Template Method pattern with Factory Method to create objects as part of the algorithm.

7. **Strategy-based Template Method**: Uses Strategy objects to implement specific steps, allowing for runtime switching of algorithms.

8. **Hierarchical Template Method**: Template methods form a hierarchy, with child template methods extending or specializing parent template methods.

9. **Event-driven Template Method**: The template method is triggered by events and calls different steps based on the event context.

10. **Functional Template Method**: Uses functional programming concepts like higher-order functions to implement the pattern, particularly in languages with first-class functions.

## When to Use the Template Method Pattern

Use the Template Method pattern when:

1. **You want to implement the invariant parts of an algorithm once and leave the variant parts to subclasses**: When the core algorithm remains the same, but specific steps can vary.

2. **You need to control how and when subclasses extend behavior**: When you want to let clients extend only specific parts of the algorithm while keeping the structure intact.

3. **You want to avoid code duplication by factoring out common behavior**: When multiple implementations share common code that can be moved to a parent class.

4. **You need to enforce a certain sequence of steps**: When the algorithm must follow a specific order of operations that shouldn't be altered.

5. **You want to implement the "Hollywood Principle" (don't call us, we'll call you)**: When the superclass should control the flow, calling subclass methods as needed.

6. **You want to provide a skeleton of an operation while allowing specific steps to be redefined**: When you need to define a framework where certain parts are fixed and others are customizable.

7. **You want to implement an algorithm's structure, but parts of the algorithm might change**: When the basic steps of an algorithm are fixed, but the implementation of those steps can vary.

8. **You have a hierarchy of classes with significant code duplication in methods**: When similar operations across subclasses can be unified into a template method.

## Real-World Examples

1. **Frameworks and Libraries**: Most application frameworks use template methods to define standard processing flows while allowing developers to customize specific behaviors.

2. **Java's Abstract Collection Classes**: Classes like `AbstractList` and `AbstractMap` implement common collection operations and leave specific operations to concrete subclasses.

3. **Web Application Frameworks**: Frameworks like Spring MVC use template methods to control the request handling process while allowing developers to customize specific parts.

4. **Database Access Object (DAO) Patterns**: DAOs often implement common CRUD operations in template methods while leaving specific database interactions to subclasses.

5. **Game Development**: Game engines use template methods to manage game loops, with specific behaviors implemented by game developers.

6. **Document Processing Systems**: Document processors use template methods to define the overall processing flow while allowing customization of specific transformations.

7. **UI Component Hierarchies**: UI frameworks use template methods to manage component lifecycle events like initialization, rendering, and disposal.

8. **Payment Processing Systems**: Payment gateways implement the general flow of payment processing while allowing different payment methods to customize specific steps.

9. **Build Tools**: Tools like Maven and Gradle use template methods to define the build lifecycle while plugins implement specific build steps.

10. **Testing Frameworks**: JUnit and similar testing frameworks use template methods to control test execution while letting developers define specific test cases.

11. **ETL (Extract, Transform, Load) Processes**: Data processing frameworks use template methods to define the overall ETL process while allowing customization of extraction, transformation, and loading steps.

12. **Service Initialization in Enterprise Applications**: Services often follow a standard initialization sequence with specific parts implemented by concrete service classes.
