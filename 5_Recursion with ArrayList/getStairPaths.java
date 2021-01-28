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
		System.out.println(getStairPath(n));
	}
	
	public static ArrayList<String> getStairPath(int n) {
		
		if(n==0){
			ArrayList<String> ba = new ArrayList<>();
			ba.add("");
			return ba;
		} else if (n < 0){
			ArrayList<String> ba = new ArrayList<>();
			return ba;
		}
		
		ArrayList<String> p1 = getStairPath(n-1);
		ArrayList<String> p2 = getStairPath(n-2);
		ArrayList<String> p3 = getStairPath(n-3);
		
		ArrayList<String> mr = new ArrayList<>();
		
		for(String str: p1){
			mr.add(1 + str);
		}
		for(String str: p2){
			mr.add(2 + str);
		}
		for(String str: p3){
			mr.add(3 + str);
		}
		
		return mr;
		
	}
}