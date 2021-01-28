import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printNQueens(new boolean[n][n], "", 0);
    }

    public static void printNQueens(boolean[][] chess, String qsf, int row) {
        if (row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }

        for (int col = 0; col < chess.length; col++) {
            if (isQueenSafe(chess, row, col) == true) {
                chess[row][col] = true;
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
                chess[row][col] = false;
            }
        }

    }

    public static boolean isQueenSafe(boolean[][] chess, int row, int col) {
        // vertical
        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] == true) {
                return false;
            }
        }

        // for diagonal 1
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == true) {
                return false;
            }
        }

        // for diagonal 2
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == true) {
                return false;
            }
        }
        return true;
    }
}