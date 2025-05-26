# State Pattern

## Intent
The State pattern is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. The pattern encapsulates state-specific behavior in separate state classes and delegates the behavior to the current state object, making it appear as if the object changed its class. This pattern localizes state-specific behavior and partitions behavior for different states, making it easier to add new states and transitions without changing the context or other state classes.

## Types of State Pattern

1. **Classic State Pattern**: The standard implementation where each state is represented by a class that implements a common interface, and the context delegates state-specific behavior to the current state object.

2. **State-Driven Transition**: The state objects themselves determine the next state and initiate transitions, as opposed to the context controlling the transitions.

3. **Event-Driven State**: State transitions are triggered by events or messages received by the context, with each state defining which events it handles and the resulting transitions.

4. **Hierarchical State Pattern**: States are organized in a hierarchy, with child states inheriting behavior from parent states but able to override specific behaviors.

5. **State Machine Pattern**: An extension that explicitly models the complete state machine, including all states and transitions, often using a transition table or matrix.

6. **Stateless State Pattern**: State objects contain no instance variables, making them shareable across multiple contexts.

7. **State Pattern with History**: Maintains a history of previous states, allowing for "undo" operations or returning to previous states.

8. **Concurrent State Pattern**: Manages multiple orthogonal state dimensions that can change independently of each other.

## When to Use the State Pattern

Use the State pattern when:

1. **An object's behavior depends on its state**: When an object must change its behavior at runtime depending on its state.

2. **State-specific behavior should be localized**: When operations have large, multipart conditional statements that depend on the object's state.

3. **State transitions are complex or numerous**: When there are many states and transitions between them that would be difficult to manage with conditionals.

4. **You need to add new states and transitions easily**: When you anticipate adding new states or changing the relationships between states.

5. **You want to avoid duplicate code across state-dependent methods**: When the same state-dependent behavior appears in multiple methods.

6. **You want to make state transitions explicit**: When it's important to clearly represent and document the possible state changes.

7. **The code has become unwieldy with state-specific conditional logic**: When state-specific conditionals are making the code difficult to maintain.

8. **You need to control the lifecycle of state objects**: When states have setup and cleanup operations that should occur when entering or exiting a state.

## Real-World Examples

1. **Vending Machines**: Different states (idle, product selected, payment pending, delivering product) with different behaviors for each button press or coin insertion.

2. **TCP Connection Management**: TCP connections transition between states like LISTEN, SYN_SENT, ESTABLISHED, and CLOSED, with different behaviors in each state.

3. **Document Editing Applications**: Documents may be in different states (viewing, editing, locked) that affect which operations are available.

4. **ATM Machines**: ATMs have different states (idle, card inserted, PIN entered, transaction selection) that change how user inputs are processed.

5. **Order Processing Systems**: Orders progress through states like new, confirmed, paid, shipped, and delivered, with different operations available in each state.

6. **Game Character Behavior**: Characters in games change behavior based on states like idle, walking, running, jumping, or attacking.

7. **UI Controls**: UI elements like buttons have different states (normal, hover, pressed, disabled) that affect their appearance and behavior.

8. **Workflow Management Systems**: Business processes transition through different states, with each state having specific validation rules and available actions.

9. **Media Players**: Players have states like stopped, playing, paused, and the behavior of controls depends on the current state.

10. **Traffic Light Controllers**: Traffic lights cycle through different states (green, yellow, red) with specific timing and sequence rules.
