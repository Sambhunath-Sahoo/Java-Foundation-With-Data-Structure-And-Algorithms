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
		printPermutations(str, "");
    }

    public static void printPermutations(String str,String ans) {
		if(str.length()==0){
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			String ros = str.substring(0,i) + str.substring(i+1);
		
			printPermutations(ros, ans+ch);
		}
	}
}