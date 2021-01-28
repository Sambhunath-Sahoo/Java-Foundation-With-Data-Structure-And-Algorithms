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
		String str = scn.nextLine();
		printSS(str,"");
		
	}
	
	public static void printSS(String str, String ans) {
		if(str.length()==0){
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		printSS(str, ans+"");
		printSS(str, ans+ch);
    }
}