package datastructures;

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

        stack = add(stack, 1);
        stack = add(stack, 2);
        stack = add(stack, 3);
        stack = add(stack, 4);
        stack = add(stack, 5);
        stack = add(stack, 6);
        stack = add(stack, 7);
        stack = add(stack, 8);
        stack = add(stack, 9);
        stack = add(stack, 10);
        stack = add(stack, 11);
        stack = add(stack, 12);
        stack = add(stack, 13);
        stack = add(stack, 14);
        stack = add(stack, 15);

        System.out.println("Getting last element from the stack : " + pop(stack));
        System.out.println("Getting last element from the stack : " + pop(stack));
        System.out.println("Getting last element from the stack : " + pop(stack));
        System.out.println("Getting last element from the stack : " + pop(stack));
    }

    private int[] createStack() {
        System.out.println("Created empty array for stack");
        return new int[0];
    }

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

    private int pop(int[] stack) throws OperationNotSupportedException {
        if(currentLastIndex < 0) {
            throw new OperationNotSupportedException("Stack is empty");
        }
        System.out.println("Returning element at index " + currentLastIndex);

        return stack[currentLastIndex--];
    }
    
}
