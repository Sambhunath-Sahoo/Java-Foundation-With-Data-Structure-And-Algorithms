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
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        boolean visited[][] = new boolean[n][m];
        floodfill(arr, 0, 0, "", visited);
    }

    public static void floodfill(int[][] maze, int sr, int sc, String ans, boolean visited[][]) {

        if (sr < 0 || sr >= maze.length || sc < 0 || sc >= maze[0].length || visited[sr][sc] == true || maze[sr][sc] == 1) {
            return;
        }

        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(ans);
        }

        visited[sr][sc] = true;

        floodfill(maze, sr - 1, sc, ans + "t", visited);

        floodfill(maze, sr, sc - 1, ans + "l", visited);

        floodfill(maze, sr + 1, sc, ans + "d", visited);

        floodfill(maze, sr, sc + 1, ans + "r", visited);

        visited[sr][sc] = false;

    }
}