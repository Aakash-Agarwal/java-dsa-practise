package datastructures;

import java.util.Arrays;

public class DynamicArrayDS {
    private int currentLastIndex = -1;

    public void demo() {
        System.out.println("Creating a dynamic array with default size of 0");
        int[] dynamicArr = createArrayDynamic();

        System.out.println("Adding first element to dynamic array");
        dynamicArr = add(dynamicArr, 0);

        dynamicArr = add(dynamicArr, 1);
        dynamicArr = add(dynamicArr, 2);
        dynamicArr = add(dynamicArr, 3);
        dynamicArr = add(dynamicArr, 4);
        dynamicArr = add(dynamicArr, 5);
        dynamicArr = add(dynamicArr, 6);
        dynamicArr = add(dynamicArr, 7);
        dynamicArr = add(dynamicArr, 8);
        dynamicArr = add(dynamicArr, 9);
        dynamicArr = add(dynamicArr, 10);
        dynamicArr = add(dynamicArr, 11);
        dynamicArr = add(dynamicArr, 12);
        dynamicArr = add(dynamicArr, 13);
        dynamicArr = add(dynamicArr, 14);
        dynamicArr = add(dynamicArr, 15);

        dynamicArr = add(dynamicArr, 16);
        dynamicArr = add(dynamicArr, 17);
        dynamicArr = add(dynamicArr, 18);
        dynamicArr = add(dynamicArr, 19);
        dynamicArr = add(dynamicArr, 20);
        dynamicArr = add(dynamicArr, 21);


        dynamicArr = add(dynamicArr, 22);
        dynamicArr = add(dynamicArr, 23);
        dynamicArr = add(dynamicArr, 24);
        dynamicArr = add(dynamicArr, 25);
        dynamicArr = add(dynamicArr, 26);
        dynamicArr = add(dynamicArr, 27);


        dynamicArr = add(dynamicArr, 28);
        dynamicArr = add(dynamicArr, 29);
        dynamicArr = add(dynamicArr, 30);
        dynamicArr = add(dynamicArr, 31);
        dynamicArr = add(dynamicArr, 32);
        dynamicArr = add(dynamicArr, 33);
        
        System.out.println("Getting array element at index 14 : " + dynamicArr[14]);
    }

    private int[] createArrayDynamic() {
        System.out.println("Created empty array");
        return new int[0];
    }

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
