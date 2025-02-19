import javax.naming.OperationNotSupportedException;

import datastructures.*;

public class TestApplication {
    public static void main(String[] args) throws OperationNotSupportedException {
        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        System.out.println("\t\t\t\tArray Data Structure");
        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        ArrayDS arrayDS = new ArrayDS();
        arrayDS.demo();
        System.out.println();

        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        System.out.println("\t\t\t\tDynamic Array Data Structure");
        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        DynamicArrayDS dynamicArrayDS = new DynamicArrayDS();
        dynamicArrayDS.demo();
        System.out.println();

        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        System.out.println("\t\t\t\tStack Data Structure");
        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        StackDS stackDS = new StackDS();
        stackDS.demo();
        System.out.println();

        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        System.out.println("\t\t\t\tQueue Data Structure");
        System.out.println("``````````````````````````````````````````````````````````````````````````````````````````");
        QueueDS queueDS = new QueueDS();
        queueDS.demo();
        System.out.println();
    }
}
