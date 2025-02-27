package datastructures.intermediate;

public class CircularQueue {
    private int front = -1;
    private int rear = -1;
    private int size = 4;

    public void demo() {
        int[] circularQueue = new int[size];

        // initializing empty list. this will be usefull in understanding the result when we print the queue
        for (int i = 0; i < 4; i ++) {
            circularQueue[i] = -1;
        }
        print(circularQueue);

        // initialize inital queue with only 4 elements
        System.out.println("Adding elements in the queue");
        for (int i = 1; i <= 4; i += 1) {
            enqueue(circularQueue, (int)(Math.random()*10));
        }
        System.out.println();

        // removing 2 elements
        System.out.println("Removing elements from the queue");
        for (int i = 1; i <= 2; i += 1) {
            dequeue(circularQueue);
        }
        System.out.println();

        // adding 3 elements in the queue
        System.out.println("Adding another 3 elements in the queue. The last element should not be added");
        for (int i = 1; i <= 3; i += 1) {
            enqueue(circularQueue, (int)(Math.random()*10));
        }
        System.out.println();

        // removing 5 elements
        System.out.println("Removing 5 elements in the queue. The last element should not be removed");
        for (int i = 1; i <= 5; i += 1) {
            dequeue(circularQueue);
        }
        System.out.println();
    }

    /**
     * Function to create and populate the queue
     * 
     * @return
     */
    private void enqueue(int[] circularQueue, int num) {
        if (isFull()) {
            System.out.println("Cannot add another element as Queue is full");
        } else {
            if (isEmpty()) {
                front = 0;
                rear = 0;
            } else {
                rear = (rear + 1)%size;
            }
            circularQueue[rear] = num;

            print(circularQueue);
        }
    }

    /**
     * Function to create and populate the queue
     * 
     * @return
     */
    private void dequeue(int[] circularQueue) {
        if (isEmpty()) {
            System.out.println("Cannot remove any element as Queue is empty");
        } else {
            circularQueue[front] = -1;
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1)%size;
            }
            print(circularQueue);
        }
        
    }

    private boolean isEmpty() {
        return front == -1;
    }

    private boolean isFull() {
        return front == (rear + 1)%size;
    }

    private void print(int[] circularQueue) {
        StringBuilder builder = new StringBuilder();
        for (int i : circularQueue) {
            builder.append(i).append(",\t");
        }
        String result = builder.toString();

        System.out.println("Front: " + front + ",\tRear: " + rear + ",\tQueue: " + result.substring(0, result.lastIndexOf(",")));
    }
}
