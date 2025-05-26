# Builder Pattern

## Intent
The Builder pattern is a creational design pattern that separates the construction of a complex object from its representation, allowing the same construction process to create different representations. It provides a step-by-step approach to building a complex object, keeping the construction process isolated from the final representation.

## Types of Builder Pattern

1. **Simple Builder**: The basic implementation where a builder interface defines construction steps, concrete builders implement these steps to create specific products, and a director orchestrates the construction process.

2. **Fluent Builder**: An enhancement to the simple builder that uses method chaining (returning `this` after each building method) to provide a more readable and fluent interface.

3. **Inner Static Builder**: A common implementation in Java where the builder is defined as a static inner class within the product class. This approach combines the product and its builder in one unit.

4. **Step Builder**: A variant that enforces a specific sequence of building steps through method return types, ensuring that the building process follows a required order.

5. **Telescoping Constructor Pattern**: Not a true builder but often replaced by the Builder pattern. It uses multiple constructors with different parameter combinations.

## When to Use the Builder Pattern

Use the Builder pattern when:

1. **The algorithm for creating a complex object should be independent of the parts that make up the object and how they're assembled**: The Builder pattern lets you vary a product's internal representation.

2. **The construction process must allow different representations for the object that's constructed**: Different builders can create different representations of the same product.

3. **You need to construct complex objects step by step**: The Builder pattern allows you to construct objects step by step, deferring steps or running steps recursively.

4. **You want to hide the complex construction process from the client**: The client only sees the abstract interface, making the client code simpler.

5. **You want to avoid telescoping constructors**: Instead of using many constructor parameters, you can use a builder to set each parameter individually.

## Real-World Examples

1. **Document Generation**: Building different document formats (PDF, HTML, plain text) from the same content using different builders.

2. **Meal Ordering**: Fast food restaurants use a builder-like process where you create a meal by selecting a main item, side, drink, and dessert.

3. **Vehicle Manufacturing**: Constructing different types of vehicles (cars, trucks, motorcycles) with various options (engine type, transmission, color, accessories).

4. **Query Builders**: Database query builders allow complex SQL queries to be constructed step by step in a readable manner.

5. **UI Construction**: Building complex user interfaces where components are added step by step.

6. **Network Request Configuration**: Libraries like Retrofit use builders to configure and create network requests with various options.

7. **Test Data Builders**: Creating test data objects with specific configurations for unit testing.

8. **Configuration Objects**: Building complex configuration objects for applications with many optional settings.
