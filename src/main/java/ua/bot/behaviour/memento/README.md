# Memento Pattern

## Intent
The Memento pattern is a behavioral design pattern that captures and externalizes an object's internal state so that the object can be restored to this state later, without violating encapsulation. The pattern allows saving and restoring the previous state of an object without revealing the details of its implementation. It delegates the responsibility of maintaining the object's state history to a separate caretaker object, ensuring that the original object's encapsulation remains intact.

## Types of Memento Pattern

1. **Basic Memento**: The classic implementation with an originator that creates mementos, a memento that stores state, and a caretaker that manages mementos.

2. **Nested Memento**: The memento is implemented as a nested class within the originator, providing better encapsulation while still allowing the originator to access the memento's state.

3. **Wide Memento**: Stores the complete state of the originator, which can be resource-intensive but guarantees full state restoration.

4. **Narrow Memento**: Stores only the state that has changed, which is more efficient but requires the originator to know which state needs to be restored.

5. **Incremental Memento**: Instead of storing complete snapshots, it stores only the changes (deltas) between states, which is efficient for large objects with small changes.

6. **Lazy Memento**: Delays the actual state copying until necessary, which can improve performance when creating mementos frequently but using them rarely.

7. **Command Memento**: Combines the Command pattern with the Memento pattern to provide undo functionality for operations rather than for object states.

8. **External Memento**: The memento's state is stored outside the memento object, such as in a database or file, which is useful for persistence across application restarts.

## When to Use the Memento Pattern

Use the Memento pattern when:

1. **You need to create snapshots of an object's state**: When you need to save and restore the state of an object at various points in time.

2. **Direct access to an object's data would expose implementation details**: When exposing an object's internal structure would violate encapsulation and break your application's architecture.

3. **You need to implement undo/redo operations**: When your application requires the ability to roll back operations or navigate through object history.

4. **You need to implement transactional behavior**: When you need to roll back a set of operations if any one of them fails.

5. **You want to implement checkpoints**: When you need to create restoration points that users or the system can return to.

6. **You need to implement versioning**: When you want to keep track of different versions of an object's state over time.

7. **You need to support "what-if" scenarios**: When your application needs to temporarily modify an object's state to explore potential outcomes without committing to those changes.

8. **You need a recovery mechanism**: When you need a way to recover from errors by restoring an object to a previous known-good state.

## Real-World Examples

1. **Text Editors and Word Processors**: Implement undo/redo functionality using the Memento pattern to save document states.

2. **Graphics Editors**: Store the state of graphical objects to allow users to undo changes to their drawings.

3. **Database Transaction Systems**: Use the pattern to maintain consistency by rolling back transactions if errors occur.

4. **Game Save Systems**: Save the state of a game at certain points so players can restart from those checkpoints.

5. **Version Control Systems**: Store snapshots of file states at different points in time.

6. **Workflow Management Systems**: Save the state of a workflow at various stages to allow resumption from any point.

7. **Form Wizard Applications**: Remember user inputs across multiple steps so users can navigate back and forth.

8. **Financial Trading Applications**: Create snapshots of trading positions to analyze and recover from problematic states.

9. **Configuration Management Tools**: Save system configurations before making changes, allowing rollback if problems occur.

10. **Virtual Machine Snapshots**: Create point-in-time captures of virtual machine states that can be restored later.
