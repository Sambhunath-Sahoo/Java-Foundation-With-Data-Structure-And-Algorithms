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
		
		String s = scn.next();
		
		for(int i=0; i<s.length(); i++) {
			for(int j = i+1; j<=s.length(); j++) {
				if(ispalindrome(s.substring(i,j))){
					System.out.println(s.substring(i,j));
				}
			}
		}
	}
	
	public static boolean ispalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		boolean flag = true;
		while(i<j){
			if(s.charAt(i) != s.charAt(j)){
				flag = false;
			}
			i++;
			j--;
		}
		return flag;
	}
}

















