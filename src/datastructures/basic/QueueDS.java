package datastructures.basic;

import java.util.Arrays;

public class QueueDS {
    int head = -1;
    int tail = -1;

    public void demo() {
        int[] queueDs = new int[10];

        // populating the queue
        for (int i = 1; i <= 11; i++) {
            System.out.println("Head: " + head + ", Tail: " + tail + ", Queue: " + printQueue(queueDs));
            System.out.println("Adding num " + i);
            queueDs = add(queueDs, i);
        }
        // since the queue is full, we will remove one element and then add
        System.out.println("Removing from index: " + head);
        queueDs = remove(queueDs);
        System.out.println("Head: " + head + ", Tail: " + tail + ", Queue: " + printQueue(queueDs));
        
        System.out.println("Adding num 12");
        queueDs = add(queueDs, 12);
        System.out.println("Head: " + head + ", Tail: " + tail + ", Queue: " + printQueue(queueDs));
        
        // removing one more element
        System.out.println("Removing from index: " + head);
        queueDs = remove(queueDs);
        System.out.println("Head: " + head + ", Tail: " + tail + ", Queue: " + printQueue(queueDs));
    }

    /**
     * Function to add elements in queue
     * 
     * @param queueDs
     * @param num
     * @return
     */
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

    /**
     * Function to remove element from queue
     * 
     * @param queueDs
     * @return
     */
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
            // shift the elements to the starting
            queueDs = shift(queueDs);
        } else {
            System.out.println("Queue is empty");
        }
        return queueDs;
    }

    /**
     * Function to create string from the elements of the queue
     * 
     * @param queueDs
     * @return
     */
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

    /**
     * Function to shift the elements to the start of the queue
     * 
     * @param queueDS
     * @return
     */
    private int[] shift(int[] queueDS) {
        int size = tail - head + 1;
        int[] newArr = Arrays.copyOf(Arrays.copyOfRange(queueDS, head, tail+1), 10);
        head = 0;
        tail = size - 1;
        return newArr;
    }
}
