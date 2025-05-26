# Strategy Pattern

## Intent
The Strategy pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. It lets the algorithm vary independently from clients that use it. The pattern enables selecting an algorithm's implementation at runtime by defining a common interface for all supported algorithms and encapsulating each algorithm in a separate class. This allows clients to use different algorithms interchangeably without modifying their code, promoting the principle of programming to an interface, not an implementation.

## Types of Strategy Pattern

1. **Classic Strategy**: The standard implementation where concrete strategies implement a common interface, and a context class delegates algorithm execution to the current strategy object.

2. **Functional Strategy**: Uses functional interfaces and lambda expressions (in languages that support them) to implement strategies more concisely without creating separate classes.

3. **Dynamic Strategy**: Strategies can be created or modified at runtime based on conditions, often using factory methods or builders.

4. **Parameterized Strategy**: Strategy implementations can be further customized through parameters, allowing fine-tuning of algorithms without creating new strategy classes.

5. **Composite Strategy**: Combines multiple strategies to create a more complex algorithm, often using the Composite pattern.

6. **Stateful Strategy**: Strategies that maintain state between executions, potentially changing behavior based on previous calls.

7. **Stateless Strategy**: Pure functional strategies that depend only on their input parameters and have no side effects.

8. **Context-Aware Strategy**: Strategies that have access to the context object and can query it for additional information needed to execute their algorithm.

9. **Hierarchical Strategy**: Strategies form a hierarchy with base strategies providing common functionality and derived strategies specializing behavior.

10. **Policy-Based Strategy**: A compile-time variant (especially in C++) where policies are selected at compile time through templates.

11. **Adaptive Strategy**: Strategies that can adapt their behavior based on runtime metrics or feedback from previous executions.

12. **Externalized Strategy**: Strategies loaded from external sources like configuration files, databases, or network services.

## When to Use the Strategy Pattern

Use the Strategy pattern when:

1. **You need to use different variants of an algorithm within an object and be able to switch between them at runtime**: When the algorithm needs to be selected or changed during program execution.

2. **You have multiple classes that differ only in their behavior**: When you can isolate the varying behavior into separate strategy classes.

3. **You need to hide complex algorithm-specific data structures from clients**: When you want to encapsulate algorithm details and prevent them from leaking into client code.

4. **A class defines many behaviors, and these appear as multiple conditional statements in its operations**: When you want to eliminate conditional statements by using polymorphism.

5. **You want to avoid exposing complex, algorithm-specific data structures**: When you need to isolate the code that uses these structures.

6. **You want to define a family of algorithms and make them interchangeable**: When algorithms need to be varied independently from clients that use them.

7. **You need to vary an algorithm's implementation without changing the client code**: When the Open/Closed Principle is important in your design.

8. **You need to isolate the business logic of a class from the implementation details of algorithms**: When you want to promote separation of concerns.

9. **You need to enable configuration of a class with one of many behaviors**: When you want to support plug-and-play behavior selection.

10. **The behavior of a class should be defined at runtime**: When the specific algorithm cannot be determined until runtime.

## Real-World Examples

1. **Payment Processing Systems**: Different payment methods (credit card, PayPal, cryptocurrency) are implemented as strategies that share a common interface.

2. **Sorting Algorithms**: Collections frameworks use strategy pattern to allow selecting different sorting algorithms (quicksort, mergesort, heapsort) based on data characteristics.

3. **Compression Algorithms**: File compression utilities implement different compression strategies (ZIP, RAR, 7z) that can be selected based on needs.

4. **Validation Strategies**: Form validation in web applications uses different strategies for validating emails, passwords, dates, etc.

5. **Route Navigation**: GPS and mapping applications use different routing strategies (fastest, shortest, avoiding highways) that can be selected by users.

6. **Image Processing Filters**: Photo editing applications implement different filters as strategies that can be applied to images.

7. **Tax Calculation Systems**: Different tax calculation algorithms for various regions or customer types are implemented as strategies.

8. **Authentication Mechanisms**: Systems support multiple authentication strategies (username/password, OAuth, biometric, two-factor) through a common interface.

9. **Layout Managers in UI Frameworks**: GUI libraries use different layout strategies (flow, grid, border) to arrange components.

10. **Game AI Behaviors**: Different AI algorithms for computer opponents in games are implemented as strategies that can be selected based on difficulty level.

11. **Discount Strategies in E-commerce**: Different discount calculation methods (percentage off, fixed amount, buy-one-get-one) are implemented as interchangeable strategies.

12. **Text Formatting in Word Processors**: Different text formatting strategies (alignment, spacing, indentation) are implemented using the Strategy pattern.

13. **Caching Algorithms**: Database and application caching systems implement different eviction strategies (LRU, FIFO, LFU) as interchangeable algorithms.

14. **Notification Services**: Systems that need to send notifications through different channels (email, SMS, push notifications) implement each as a strategy.

15. **Load Balancing Algorithms**: Server systems implement different load distribution strategies (round-robin, least connections, resource-based) that can be selected based on needs.
