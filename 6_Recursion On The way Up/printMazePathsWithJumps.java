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
        PMPWJ(0, 0, n - 1, m - 1, "");
    }

    public static void PMPWJ(int sr, int sc, int dr, int dc, String psf) {
        if(sr < 0 || sc < 0){
            return;
        }
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }

        for (int i = 1; i <= dc - sc; i++) {
            PMPWJ(sr, sc + i, dr, dc, psf + "h" + i);
        }
        for (int i = 1; i <= dr - sr; i++) {
            PMPWJ(sr + i, sc, dr, dc, psf + "v" + i);
        }

        for (int i = 1; i <= dr - sr && i <= dc - sc; i++) {
            PMPWJ(sr + i, sc + i, dr, dc, psf + "d" + i);
        }
    
    }
}