## Arrays

- Arrays are continuous blocks of memory.
- Data is stored in these blocks.
- The size of each block depends on the data to be stored.
- The order of insertion of the data is maintained.
- The address of each block is fetched by the formula:
  `Address of nth block = Address of first block + size of each block * (n-1)`

**Time Complexity**

- Get: O(1)
- Insert or Update: O(1)
- Search: O(log n) or O(n) depending on the search algorithm used

**Example with Code**

(Insert code example here)

## Dynamic Arrays

- Similar to arrays, but the size is adjusted dynamically.
- The initial size is typically 0.
- Upon the first insertion, the size is often set to a default value (e.g., 10).
- As elements are inserted and the array starts to fill up, a new array with an increased capacity (e.g., 50% more) is created, and all elements are copied to the new array.
- The logic to calculate the address of the block is the same as for a static array.

**Time Complexity**

- Get: O(1)
- Insert or Update: O(1) (Amortized, due to potential resizing)
- Search: O(log n) or O(n) depending on the search algorithm used

**Example with Code**

[Array Data Structure Impl](src/datastructures/ArrayDS.java)

[Dynamic Array Data Structure Impl](src/datastructures/DynamicArrayDS.java)