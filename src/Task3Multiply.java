/**
 * Task 3:
 * Multiplying 2 2D arrays using "for" loop.
 */

public class Task3Multiply {
    public static void main(String[] args) {
        int [][] array1 =  {{1,0,0,0}, {0,1,0,0}, {0,0,0,0}};
        int [][] array2 = {{1,2,3}, {1,1,1}, {0,0,0}, {2,1,0}};
        int [][] arrayResult = new int[array1.length][array2[0].length];


        for (int i=0; i<arrayResult[0].length; i++)
            for (int j=0; j<arrayResult.length; j++)
                for (int k=0; k<array1[0].length; k++)
                    arrayResult[i][j] = arrayResult[i][j] + array1[i][k] * array2[k][j];


        for (int i = 0; i < arrayResult.length; i++) {
            for (int j = 0; j < arrayResult[0].length; j++) {
                System.out.print(" " + arrayResult[i][j] + " ");
            }
            System.out.println();
        }

    }
}
