# Iterator Pattern

## Intent
The Iterator pattern is a behavioral design pattern that provides a way to access elements of an aggregate object (collection) sequentially without exposing its underlying representation. It allows traversing different collections uniformly by abstracting the traversal algorithm from the collection's structure. The pattern defines a separate (iterator) object that encapsulates accessing and traversing the collection, enabling multiple concurrent traversals, alternative traversal methods, and simplifying the collection's interface by moving traversal responsibilities to the iterator.

## Types of Iterator Pattern

1. **External Iterator**: The traditional implementation where the client controls the iteration by calling methods like `hasNext()` and `next()` explicitly. The traversal algorithm is externalized from the aggregate.

2. **Internal Iterator**: The aggregate controls the iteration, and the client simply provides an operation to be performed on each element. This is often implemented using callbacks or lambda expressions.

3. **Forward Iterator**: Supports only forward traversal of the collection (the most common type).

4. **Bidirectional Iterator**: Supports both forward and backward traversal with methods like `previous()` and `hasPrevious()`.

5. **Random Access Iterator**: Allows direct access to elements at any position, often through an index.

6. **Robust Iterator**: Handles modifications to the underlying collection during iteration, possibly through mechanisms like fail-fast or copy-on-write.

7. **Snapshot Iterator**: Creates a snapshot of the collection at the beginning of iteration, protecting against concurrent modifications.

8. **Filtered Iterator**: Skips elements that don't match specific criteria during traversal.

9. **Composite Iterator**: Used with the Composite pattern to traverse hierarchical structures, capable of depth-first or breadth-first traversal.

10. **Null Iterator**: A special iterator that always returns "no more elements" to handle edge cases or empty collections.

## When to Use the Iterator Pattern

Use the Iterator pattern when:

1. **You need to access a collection's contents without exposing its internal structure**: When the internal representation should be hidden from clients.

2. **You want to support multiple traversals of a collection simultaneously**: When multiple iterators should be able to traverse the same collection independently.

3. **You need to provide a uniform interface for traversing different collection types**: When you want to make collections interchangeable with respect to how they're traversed.

4. **You want to vary the traversal algorithm without changing the collection**: When different traversal methods (e.g., in-order, pre-order, post-order for trees) need to be supported.

5. **The collection has a complex structure but needs a simple traversal interface**: When the collection structure is complex but you want to hide that complexity from clients.

6. **You need to access collection elements in a specific order**: When elements need to be traversed in a particular sequence regardless of how they're stored.

7. **You want to decouple algorithms from collection implementations**: When algorithms should work with multiple collection types without knowing their specifics.

8. **You need to support traversal methods that aren't supported by the collection itself**: When you want to add traversal capabilities not natively provided by the collection.

## Real-World Examples

1. **Java Collections Framework**: The `java.util.Iterator` interface used throughout Java's collections.

2. **Database Cursors**: Database systems use iterators to retrieve and process query results one row at a time.

3. **File Systems**: Directory browsers use iterators to traverse files and folders without loading the entire directory structure.

4. **Web Browsers**: History mechanisms use iterators to move backward and forward through visited pages.

5. **Social Media Feeds**: Infinite scrolling feeds implement iterators to load and display content incrementally.

6. **XML/DOM Parsers**: Document traversal APIs use iterators to walk through hierarchical document structures.

7. **Network Packet Processing**: Network analyzers use iterators to process streams of packets sequentially.

8. **Image Processing**: Pixel iterators allow operations on images without exposing the underlying representation.

9. **UI Component Hierarchies**: UI frameworks use iterators to traverse component trees for rendering or event propagation.

10. **Compiler/Interpreter Symbol Tables**: Language processors use iterators to traverse symbol tables during compilation or interpretation.

11. **Data Streaming Platforms**: Systems like Kafka or Spark use iterators to process data streams element by element.

12. **Graph Traversal Algorithms**: BFS and DFS algorithms use iterators to traverse graph structures.
