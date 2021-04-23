/**
 * Task 4:
 * Program creates an array of random numbers and calculates the total sum.
 * The array is 2D, size 2x2 for easier traceability.
 */


public class Task4Sum {
    public static void main(String[] args) {

        double[][] twoDimArray = new double[2][2];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = (int) (Math.random() * 10);

            }
        }

        System.out.println("Our initial 2D array of random numbers looks as follows:");

        for (int i = 0; i < twoDimArray.length; i++, System.out.println()) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }

        }

        int sum = 0;

        for (int i=0;i<twoDimArray.length;i++){
            for(int j=0;j< twoDimArray.length;j++){
                sum += twoDimArray[i][j];
            }
        }
        System.out.println("Sum of array elements = " + sum);


    }
}