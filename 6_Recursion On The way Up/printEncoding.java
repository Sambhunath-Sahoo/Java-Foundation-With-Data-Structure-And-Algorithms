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
		String str = scn.next();
		printEncodings(str, "");
	}
	
	public static void printEncodings(String str, String ans) {
		if(str.length() == 0){
			System.out.println(ans);
			return;
		}
		
		if(str.charAt(0) == 0){
			return;
		}
		
		String ch0 = str.substring(0,1);
		String ros1 = str.substring(1);
		printEncodings(ros1, ans + (char)(Integer.parseInt(ch0) - 1 + 'a'));
	
		if(str.length() >= 2){
			String ch01 = str.substring(0,2);
			String ros2 = str.substring(2);
			if(Integer.parseInt(ch01) <= 26){
				printEncodings(ros2, ans + (char)(Integer.parseInt(ch01) - 1 + 'a'));
			}
		}
    }
}