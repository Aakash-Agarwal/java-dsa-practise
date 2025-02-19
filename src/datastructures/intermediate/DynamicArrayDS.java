package datastructures.intermediate;

import java.util.Arrays;

public class DynamicArrayDS {
    private int currentLastIndex = -1;

    public void demo() {
        System.out.println("Creating a dynamic array with default size of 0");
        int[] dynamicArr = createArrayDynamic();

        System.out.println("Adding first element to dynamic array");
        dynamicArr = add(dynamicArr, 0);

        for (int i = 1; i <= 33; i++) {
            dynamicArr = add(dynamicArr, i);
        }
        
        System.out.println("Getting array element at index 14 : " + dynamicArr[14]);
    }

    /**
     * Function to create an empty dynamic array
     * 
     * @return
     */
    private int[] createArrayDynamic() {
        System.out.println("Created empty array");
        return new int[0];
    }

    /**
     * Function to add an element to the dynamic array
     * 
     * @param dynamicArr
     * @param num
     * @return
     */
    private int[] add(int[] dynamicArr, int num) {
        if(dynamicArr.length == 0) {
            dynamicArr = new int[10];
            System.out.println("Increased array size to 10");
        } else if (currentLastIndex == dynamicArr.length - 1) {
            dynamicArr = Arrays.copyOf(dynamicArr, dynamicArr.length + (dynamicArr.length >> 1));
            System.out.println("Increased array size to " + dynamicArr.length);
        }
        System.out.println("Adding element " + num);
        dynamicArr[++currentLastIndex] = num;

        return dynamicArr;
    }
}
