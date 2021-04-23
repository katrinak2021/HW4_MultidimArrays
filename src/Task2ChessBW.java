/**
 * Task 2:
 * Program checks if sum of indexes is odd/even. If odd - it's black. Even - it's white.
 * The result is a 8x8 items chessboard simulation.
 */

public class Task2ChessBW {
    public static void main(String[] args) {
        String[][] chessBW = new String[8][8];

        for(int i=0; i < chessBW.length; i++){
            for(int j=0; j < chessBW.length; j++)
                if((i+j)%2==0)
                    System.out.print("B ");
                else
                    System.out.print("W ");
            System.out.println();
        }

    }
}
