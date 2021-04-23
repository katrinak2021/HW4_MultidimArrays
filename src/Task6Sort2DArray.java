/**
 * Task 6:
 * A 2d array of random numbers is created and sorted using loop.
 */

public class Task6Sort2DArray {
    public static void main(String[] args) {

        int[][] array2D = new int[5][5];
        int min = 1;
        int max = 10;
        int b;

        System.out.println("The unsorted 2D array looks as follows:");

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D.length; j++) {
                array2D[i][j] = min + (int) (Math.random() * (max - min + 1));
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");


        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D.length; j++) {
                for (int k = j + 1; k < array2D.length; k++) {

                    if (array2D[i][j] > array2D[i][k]) {
                        b = array2D[i][j];
                        array2D[i][j] = array2D[i][k];
                        array2D[i][k] = b;
                    }
                }
            }
        }

        System.out.println("The sorted array:");


        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D.length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");

    }
}
