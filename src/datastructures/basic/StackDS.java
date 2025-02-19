package datastructures.basic;

import java.util.Arrays;

import javax.naming.OperationNotSupportedException;

public class StackDS {
    private int currentLastIndex = -1;

    public void demo() throws OperationNotSupportedException {
        // create stack
        System.out.println("Creating a stack with default size of 0");
        int[] stack = createStack();

        System.out.println("Adding first element to stack");
        stack = add(stack, 0);

        for (int i = 1; i <= 15; i++) {
            stack = add(stack, i);

        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Getting last element from the stack : " + pop(stack));
        }
    }

    /**
     * Function to create an empty stack
     * 
     * @return
     */
    private int[] createStack() {
        System.out.println("Created empty array for stack");
        return new int[0];
    }

    /**
     * Function to add an element to the stack
     * s
     * @param stack
     * @param num
     * @return
     */
    private int[] add(int[] stack, int num) {
        if(stack.length == 0) {
            stack = new int[10];
            System.out.println("Increased stack size to 10");
        } else if (currentLastIndex == stack.length - 1) {
            stack = Arrays.copyOf(stack, stack.length + (stack.length >> 1));
            System.out.println("Increased stack size to " + stack.length);
        }
        System.out.println("Adding element " + num);
        stack[++currentLastIndex] = num;

        return stack;
    }

    /**
     * Function to remove an element from the stack
     * 
     * @param stack
     * @return
     * @throws OperationNotSupportedException
     */
    private int pop(int[] stack) throws OperationNotSupportedException {
        if(currentLastIndex < 0) {
            throw new OperationNotSupportedException("Stack is empty");
        }
        System.out.println("Returning element at index " + currentLastIndex);

        return stack[currentLastIndex--];
    }
    
}
