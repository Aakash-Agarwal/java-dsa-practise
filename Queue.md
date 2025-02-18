## Queues

- A queue data structure arranges data in a First-In, First-Out (FIFO) order.
- The data may or may not be stored in contiguous memory blocks.
- During retrieval, the first item inserted into the queue is returned.
- Two pointers, "Head" and "Tail," are used. "Head" points to the first element's index, and "Tail" points to the last element's index.
- The size of queue is head - tail + 1

**Time Complexity**

- Get: O(n) (O(1) to get the element, O(n) to shift elements forward in some implementations) or O(1) if implemented efficiently with circular buffers or linked lists.
- Insert or Update: O(1)
- Search: O(n) or O(log n) based on the search algorithm used

**Example with Code**

```java
package datastructures;

import java.util.Arrays;

public class QueueDS {
    int head = -1;
    int tail = -1;

    public void demo() {
        int[] queueDs = new int[10];
        for (int i = 1; i <= 11; i++) {
            System.out.println("Head: " + head + ", Tail: " + tail + ", Queue: " + printQueue(queueDs));
            System.out.println("Adding num " + i);
            queueDs = add(queueDs, i);
        }
        System.out.println("Removing from index: " + head);
        queueDs = remove(queueDs);
        System.out.println("Head: " + head + ", Tail: " + tail + ", Queue: " + printQueue(queueDs));
        
        System.out.println("Adding num 12");
        queueDs = add(queueDs, 12);
        System.out.println("Head: " + head + ", Tail: " + tail + ", Queue: " + printQueue(queueDs));
        
        System.out.println("Removing from index: " + head);
        queueDs = remove(queueDs);
        System.out.println("Head: " + head + ", Tail: " + tail + ", Queue: " + printQueue(queueDs));
    }

    private int[] add(int[] queueDs, int num) {
        if (tail < queueDs.length - 1) {
            queueDs[++tail] = num;
            if (tail == 0) {
                head = tail;
            }
        } else {
            System.out.println("Queue is full");
        }
        return queueDs;
    }

    private int[] remove(int[] queueDs) {
        if (head > -1) {
            int num = queueDs[head];
            System.out.println("Num: " + num);
            if (head == tail) {
                head = -1;
                tail = -1;
            } else {
                head++;
            }
            if (tail == 0) {
                head = tail;
            }
            queueDs = shift(queueDs);
        } else {
            System.out.println("Queue is empty");
        }
        return queueDs;
    }

    private String printQueue(int[] queueDs) {
        StringBuilder result = new StringBuilder();
        for (int i = head; i < tail; i++) {
            if (i > -1) {
                result.append(queueDs[i]).append(",");
            }
        }
        if (tail > -1) {
            result.append(queueDs[tail]);
        }
        return result.toString();
    }

    private int[] shift(int[] queueDS) {
        int size = tail - head;
        int[] newArr = Arrays.copyOf(Arrays.copyOfRange(queueDS, head, tail+1), 10);
        head = 0;
        tail = size;
        return newArr;
    }
}

```