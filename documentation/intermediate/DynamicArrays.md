# Dynamic Arrays

- Similar to arrays, but the size is adjusted dynamically.
- The initial size is typically 0.
- Upon the first insertion, the size is often set to a default value (e.g., 10).
- As elements are inserted and the array starts to fill up, a new array with an increased capacity (e.g., 50% more) is created, and all elements are copied to the new array.
- The logic to calculate the address of the block, searching is the same as for a static array.

## **Time Complexity**

- Get: O(1)
- Insert or Update: O(1) (Amortized, due to potential resizing)
- Search: O(log n) or O(n) depending on the search algorithm used

## **Example with Code**

[Dynamic Array Data Structure Impl](/src/datastructures/intermediate/DynamicArrayDS.java)