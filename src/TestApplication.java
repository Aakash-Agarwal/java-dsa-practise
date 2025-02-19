import javax.naming.OperationNotSupportedException;

import datastructures.*;

public class TestApplication {
    public static void main(String[] args) throws OperationNotSupportedException {
        ArrayDS arrayDS = new ArrayDS();
        arrayDS.demo();

        DynamicArrayDS dynamicArrayDS = new DynamicArrayDS();
        dynamicArrayDS.demo();

        StackDS stackDS = new StackDS();
        stackDS.demo();

        QueueDS queueDS = new QueueDS();
        queueDS.demo();
    }
}
