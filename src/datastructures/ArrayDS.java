package datastructures;

public class ArrayDS {
    public void demo() {
        // createArray
        System.out.println("Creating an array of 5 elements");
        int[] intArr = createArray();
        
        // getArrayElement at location 3
        System.out.println("Element at location 3: " + intArr[2]);
        
        // updateArrayElement at location 3
        System.out.println("Updating element at location 3 to 10");
        intArr[2] = 10;
        System.out.println("Element at location 3: " + intArr[2]);
    }

    /**
     * Function to create an array of 5 elements
     * 
     * @return
     */
    private int[] createArray() {
        int[] intArr = new int[5];

        // adding element inside the array
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        intArr[3] = 4;
        intArr[4] = 5;

        return intArr;
    }
}
