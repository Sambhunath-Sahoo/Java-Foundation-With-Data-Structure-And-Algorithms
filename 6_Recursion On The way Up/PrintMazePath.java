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
        PMP(0, 0, n - 1, m - 1, "");
    }

    public static void PMP(int sr, int sc, int dr, int dc, String psf) {

        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }

        if (sc + 1 <= dc) {
            PMP(sr, sc + 1, dr, dc, psf + "h");
        }
        if (sr + 1 <= dr) {
            PMP(sr + 1, sc, dr, dc, psf + "v");
        }
    }
}