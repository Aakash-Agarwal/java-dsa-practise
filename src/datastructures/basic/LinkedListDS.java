package datastructures.basic;

public class LinkedListDS {
    private Node head = null;
    private Node tail = null;

    /**
     * Node class for linked list. Each node consists of data and reference of next node
     */
    private static class Node {
        private int data;
        private Node next;

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    public void demo() {
        print();
        System.out.println("Adding elements in the Linked List");
        for (int i = 1; i <= 10; i ++) {
            add(i);
            print();
        }
        System.out.println("Removing elements from the Linked List");
        for (int i = 1; i <= 10; i ++) {
            System.out.println("Removed: " + remove().data);
            print();
        }
    }

    /**
     * Function to add number in the linked list
     * 
     * @param num
     */
    private void add(int num) {
        Node node = new Node();
        node.data = num;
        node.next = null;

        if (head == null) {
            head = node;
        }
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
    }

    /**
     * Function to remove element from the linked list
     * 
     * @return
     */
    private Node remove() {
        if (head == null) {
            return null;
        }
        Node node = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        return node;
    }

    /**
     * Function to print the list
     */
    private void print() {
        Node temp = head;
        StringBuilder builder = new StringBuilder();
        while (temp != null) {
            builder.append(temp).append(",");
            temp = temp.next;
        }
        System.out.println("Head: " + head + ", Tail: " + tail + ", Linked List: " 
        + (builder.isEmpty() ? "Empty list" : builder.deleteCharAt(builder.lastIndexOf(",")).toString()));
    }
}
