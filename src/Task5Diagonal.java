/**
 * Task5:
 * A 2D array of randoms is created.
 * Using the loop, program shows diagonal items, from left to right.
 */

public class Task5Diagonal {
    public static void main(String[] args) {
        int a[][] = new int[5][5];
        int min = 1;
        int max = 10;
        int b;

        System.out.println("Our initial 2D array of randoms looks as follows:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = min + (int) (Math.random() * (max - min + 1));
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");

        System.out.println("Diagonally situated items are following:");

        int dim=5;

        for( int k = 0 ; k < dim * 2 ; k++ ) {
            for( int j = 0 ; j <= k ; j++ ) {
                int i = k - j;
                if( i < dim && j < dim ) {
                    System.out.print( a[i][j] + " " );
                }
            }
            System.out.println();
        }

    }
}
