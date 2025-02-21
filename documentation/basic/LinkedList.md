# Linked List

- Linked lists are a non continuous blocks of memory.
- Each block holds two values: data, and the address of next block
- Blocks are known as Nodes in linked lists
- Linked List can grow and shrink dynamically.
- The order of insertion of the data is maintained.
- The data can be retrieved from start of the list only.
- Two pointers, "Head" and "Tail", are used. "Head" points to the first element's node, and "Tail" points to the last element's node.
- To search an element we need to traverse through the list sequentially using a "Temp" pointer. For more info, check [here]

## **Time Complexity**

- Get: O(n)
- Insert or Update: O(1)
- Search: O(n)

## **Example with Code**

[Linked List Data Structure Impl](src/datastructures/basic/LinkedListDS.java)