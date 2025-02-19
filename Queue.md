## Queues

- A queue data structure arranges data in a First-In, First-Out (FIFO) order.
- The data may or may not be stored in contiguous memory blocks.
- During retrieval, the first item inserted into the queue is returned.
- Two pointers, "Head" and "Tail," are used. "Head" points to the first element's index, and "Tail" points to the last element's index.
- The size of queue is head - tail + 1

**Time Complexity**

- Get: O(n): (O(1) to get the element, O(n) to shift elements forward in some implementations) or O(1) if implemented efficiently with circular buffers or linked lists.
- Insert or Update: O(1)
- Search: O(n) or O(log n) based on the search algorithm used

**Example with Code**

[Queue Data Structure Impl](src/datastructures/QueueDS.java)