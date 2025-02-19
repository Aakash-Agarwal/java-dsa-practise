# Arrays

- Arrays are continuous blocks of memory.
- Data is stored in these blocks.
- The size of each block depends on the data to be stored.
- The order of insertion of the data is maintained.
- The address of each block is fetched by the formula:
  `Address of nth block = Address of first block + size of each block * (n-1)`
- Searching of an element is either done by sequential search, or by using binary search
- In sequential search we traverse through the list and match every element with the target element, and if it matches we return the index. For more info, check [here]()
- In bnary search we iteratively calculate the mid index and match the element with the target element, and if it matches we return the index. For more info, check [here]()

## **Time Complexity**

- Get: O(1)
- Insert or Update: O(1)
- Search: O(log n) or O(n) depending on the search algorithm used

## **Example with Code**

[Array Data Structure Impl](src/datastructures/basic/ArrayDS.java)