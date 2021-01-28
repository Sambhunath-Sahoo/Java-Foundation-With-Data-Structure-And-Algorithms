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
		System.out.println(getMazePath(0, 0, n-1, m-1));
	}
	
	public static ArrayList<String> getMazePath(int sr, int sc, int n, int m) {
		if(sr==n+1 || sc ==m+1){
			ArrayList<String> ba = new ArrayList<>();
			return ba;
		} else if (sr == n && sc == m){
			ArrayList<String> ba = new ArrayList<>();
			ba.add("");
			return ba;
		}
		
		ArrayList<String> p1 = getMazePath(sr , sc+1, n, m);
		ArrayList<String> p2 = getMazePath(sr+1, sc, n, m);
		
		ArrayList<String> mr = new ArrayList<>();
		
		for(String str: p1){
			mr.add('h' + str);
		}
		for(String str: p2){
			mr.add('v' + str);
		}
		
		return mr;
		
	}
}