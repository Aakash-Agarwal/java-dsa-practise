# Queues

- A queue data structure arranges data in a First-In, First-Out (FIFO) order.
- The data may or may not be stored in contiguous memory blocks.
- During retrieval, the first item inserted into the queue is returned.
- Two pointers, "Head" and "Tail", are used. "Head" points to the first element's index, and "Tail" points to the last element's index.
- The size of queue is head - tail + 1
- To search an element we need to traverse through the list sequentially. For more info, check [here]
- Shifting is a neccesary step in queue to avoid false overflow issue in queue. More details [here](https://prepinsta.com/data-structures-algorithms/circular-queue-using-array-in-c/)
- Circular queues can be implemented to avoid this issue. Read about circular queue [here](../intermediate/CircularQueue.md)

## **Time Complexity**

- Get: O(n): (O(1) to get the element, O(n) to shift elements forward in some implementations) or O(1) if shifting is skipped.
- Insert or Update: O(1)
- Search: O(n)

## **Example with Code**

[Queue Data Structure Impl](/src/datastructures/basic/QueueDS.java)