## Stacks

- A stack data structure arranges data in a Last-In, First-Out (LIFO) order.
- The data may or may not be stored in contiguous memory blocks.
- During retrieval, the last item inserted into the stack is returned.
- A "Head" pointer in a stack always points to the last element's index.
- To search for an element, we need to sequentially pop elements from the stack and place them into another stack. As we pop and save each element, we compare it to the target element. If a match is found, we return the result. Afterward, we must transfer all the elements from the second stack back to the first stack. For more info, check [here]

**Time Complexity**

- Get: O(1)
- Insert or Update: O(1)
- Search: Not applicable (typically not a search-oriented data structure)

**Example with Code**

[Stack Data Structure Impl](src/datastructures/StackDS.java)