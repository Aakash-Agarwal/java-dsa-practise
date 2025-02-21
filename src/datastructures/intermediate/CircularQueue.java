package datastructures.intermediate;

public class CircularQueue {
    private int front = -1;
    private int rear = -1;
    private int size = 10;

    public void demo() {
        int[] circularQueue = new int[size];

        // initializing empty list. this will be usefull in understanding the result when we print th queue
        for (int i = 0; i < 10; i ++) {
            circularQueue[i] = -1;
        }
        print(circularQueue);

        // initialize inital queue with only 5 elements
        for (int i = 2; i <= 10; i += 2) {
            rear = (rear + 1)%size;
            circularQueue[rear] = i;
        }

        // removing 3 elements

    }

    /**
     * Function to create and populate the queue
     * 
     * @return
     */
    private void enqueue(int[] circularQueue, int num) {
        rear = (rear + 1)%size;
        if (rear != front) {
            circularQueue[rear] = num;
        }
    }

    /**
     * Function to create and populate the queue
     * 
     * @return
     */
    private void dequeue(int[] circularQueue, int num) {
        rear = (rear + 1)%size;
        if (rear != front) {
            circularQueue[rear] = num;
        }
    }

    private void print(int[] circularQueue) {
        StringBuilder builder = new StringBuilder();
        for (int i : circularQueue) {
            builder.append(i).append(", ");
        }
        String result = builder.toString();

        System.out.println("Front: " + front + ", Rear: " + rear + ", Queue: " + result.substring(0, result.lastIndexOf(",")));
    }
}
