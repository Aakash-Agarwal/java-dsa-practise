import javax.naming.OperationNotSupportedException;

import datastructures.basic.*;

public class TestApplication {
    public static void main(String[] args) throws OperationNotSupportedException {
        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        System.out.println("\t\t\t\t Array Data Structure");
        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        ArrayDS arrayDS = new ArrayDS();
        arrayDS.demo();
        System.out.println();

        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        System.out.println("\t\t\t\t Dynamic Array Data Structure");
        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        DynamicArrayDS dynamicArrayDS = new DynamicArrayDS();
        dynamicArrayDS.demo();
        System.out.println();

        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        System.out.println("\t\t\t\t Stack Data Structure");
        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        StackDS stackDS = new StackDS();
        stackDS.demo();
        System.out.println();

        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        System.out.println("\t\t\t\t Queue Data Structure");
        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        QueueDS queueDS = new QueueDS();
        queueDS.demo();
        System.out.println();

        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        System.out.println("\t\t\t\t Linked List Data Structure");
        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        LinkedListDS linkedListDS = new LinkedListDS();
        linkedListDS.demo();
        System.out.println();
    }
}
