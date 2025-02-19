package datastructures.intermediate;

/**
 * ND Array stands for N-Dimensional Array
 */
public class NDArrayDS {

    public void demo() {
        System.out.println("Number table matrix");
        int[][] numTables = create2DArray();
        print2D(numTables);
        System.out.println("\n\nTable and Square Matrix");
        int[][][] numTablesAndSquare = create3DArray();
        print3D(numTablesAndSquare);
    }

    /**
     * Function to create a 2 dimensional array also known as matrix
     * 
     * @return
     */
    private int[][] create2DArray() {
        int[][] numTables = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                 // populating array elements with multiples of i+1
                numTables[i][j] = (i+1) * (j+1);
            }
        }

        return numTables;
    }

    /**
     * Function to create a 3 dimensional array. In the 3rd dimention we have jsut stored a number and it's square
     * 
     * @return
     */
    private int[][][] create3DArray() {
        int[][][] numTablesAndSquare = new int[3][3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // populating array elements with multiples of i+1
                numTablesAndSquare[i][j][0] = ((i+1) * (j+1));
                // populating array elements with square of numTablesAndSquare[i][j][0]
                numTablesAndSquare[i][j][1] = ((i+1) * (j+1)) * ((i+1) * (j+1));
            }
        }

        return numTablesAndSquare;
    }

    /**
     * Function to print a matrix
     * 
     * @param numTables
     */
    private void print2D(int[][] numTables) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(numTables[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Function to print a simple 3d array
     * 
     * @param numTablesAndSquare
     */
    private void print3D(int[][][] numTablesAndSquare) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numTablesAndSquare[i][j][0] + ", " + numTablesAndSquare[i][j][1] + "\t\t");
            }
            System.out.println();
        }
    }
    
}
