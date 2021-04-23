/**
 * Task 1:
 * 3d array is created and filled with random numbers.
 * User enters any number.
 * Loop adds the number to each item of 3d array.
 * The result is shown in "Before-after" view type.
 *
 */

import java.util.Scanner;

public class Task1AddNumber {
    public static void main(String[] args) {

        Scanner userNum = new Scanner(System.in);
        System.out.println("Please enter the number to add to each item");
        int toAdd = userNum.nextInt();

        System.out.println("Our 3-dimensional array before adding looks as follows:");

        double[][][] threeDimArray = new double[2][2][2];

        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                for (int k = 0; k < threeDimArray[j].length; k++) {
                    threeDimArray[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }
        for (int i = 0; i < threeDimArray.length; i++, System.out.println()) {
            for (int j = 0; j < threeDimArray[i].length; j++, System.out.println()) {
                for (int k = 0; k < threeDimArray[j].length; k++)

                    System.out.print(threeDimArray[i][j][k] + " ");
            }

        }

                System.out.println("Our array after adding your number looks as follows:");

                for (double[][] item1 : threeDimArray) {
                    for (double[] item2 : item1) {
                        for (double item3 : item2) {
                            item3 = item3 + toAdd;
                            System.out.print(item3 + "\t");
                        }
                        System.out.println();
                    }

                }
            }
        }
