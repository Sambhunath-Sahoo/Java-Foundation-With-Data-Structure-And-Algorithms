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
        System.out.println(getMazePaths(1, 1, n, m));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        
        ArrayList<String> paths = new ArrayList<>();
        
        // horizontal moves
        for(int ms=1; ms<=dc-sc ; ms++) {
            ArrayList<String> hpaths = getMazePaths(sr, sc+ms, dr, dc);
            for(String hpath: hpaths) {
                paths.add("h" + ms + hpath);
            }
        }
        
        // vertical paths
        for(int ms=1; ms<=dr-sr ; ms++) {
            ArrayList<String> vpaths = getMazePaths(sr+ms, sc, dr, dc);
            for(String vpath: vpaths) {
                paths.add("v" + ms + vpath);
            }
        }
        
        // diagonal paths
        for(int ms=1; ms<=dr-sr && ms<=dc-sc; ms++) {
            ArrayList<String> dpaths = getMazePaths(sr+ms, sc+ms, dr, dc);
            for(String dpath: dpaths) {
                paths.add("d" + ms + dpath);
            }
        }
        return paths;
    }
}