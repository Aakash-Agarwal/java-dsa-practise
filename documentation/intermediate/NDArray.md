# N Dimensional Arrays

- NDArrays, or N-Dimension Arrays, are array if arrays.
- N-dimensional arrays, like their 1D counterparts, are stored as contiguous blocks of memory. This means that all elements are placed one after another in memory, allowing for efficient access.
- There is not limit to the number of dimensions in a N-D Arrays
- The size of each block depends on the data to be stored.
- The order of elements within the N-dimensional array is maintained based on how they are stored.
- While the address calculation for N-dimensional arrays is more complex than for 1D arrays, the principle remains the same.  The address of an element is calculated based on the starting address of the array, the size of each element, and the indices of the element in each dimension.  The specific formula depends on the storage order (row-major or column-major).  A simplified conceptual representation (not the actual formula) for a 2D array might be:  `Address = Base Address + Row Index * Row Size * Element Size + Column Index * Element Size`.  This concept generalizes to higher dimensions.
- Searching of an element is either done by sequential search, or by using binary search
- In sequential search we traverse through the list and match every element with the target element, and if it matches we return the index. For more info, check [here]()
- In binary search we iteratively calculate the mid index and match the element with the target element, and if it matches we return the index. For more info, check [here]()

## **Time Complexity**

- Get: O(1)
- Insert or Update: O(1)
- Search: O(n * log n) or O(n * n) depending on the search algorithm used (this value is for 2D array)

## **Example with Code**

[ND Array Data Structure Impl](src/datastructures/intermediate/NDArrayDS.java)