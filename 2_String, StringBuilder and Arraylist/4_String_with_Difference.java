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
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(asciiDiff(str));
    }
	
	public static String asciiDiff(String str){
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		
		for(int i=1; i<str.length(); i++){
			int gap = str.charAt(i) - str.charAt(i-1);
			sb.append(gap);
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
	}
}

















