# Composite Pattern

## Intent
The Composite pattern allows you to compose objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects (leaves) and compositions of objects (composites) uniformly.

## Structure
![Composite Pattern Structure](composite-pattern.png)

The Composite pattern consists of these components:

- **Component**: An interface for all objects in the composition, both simple (Leaf) and complex (Composite). It defines operations that are common to both.
- **Leaf**: Represents end objects of a composition. A leaf has no children and implements the Component interface.
- **Composite**: Represents complex components that may have children. It implements the Component interface and provides additional methods for adding, removing, and accessing child components.
- **Client**: Manipulates objects in the composition through the Component interface.

## When to Use the Composite Pattern

Use the Composite pattern when:

1. **You want to represent part-whole hierarchies of objects**: When you have objects that can be composed into tree structures.

2. **You want clients to be able to ignore differences between compositions of objects and individual objects**: When you want to treat both composite and individual objects uniformly.

3. **The structure can have any level of complexity**: When the part-whole hierarchy has multiple levels and branches.

4. **You need to add new types of components frequently**: When the system needs to be easily extensible with new component types.

## Real-World Examples

1. **File Systems**: Directories (composites) can contain files (leaves) and other directories, forming a tree structure.

2. **Graphic Systems**: A drawing program where a drawing can consist of simple shapes (leaves) and complex groups of shapes (composites).

3. **Organization Structures**: Companies with departments and individual employees, where departments can contain sub-departments and employees.

4. **UI Components**: UI frameworks where containers (panels, windows) can hold other containers or individual components (buttons, text fields).

5. **Menu Systems**: Menu systems where menus can contain menu items (leaves) or other menus (composites).

