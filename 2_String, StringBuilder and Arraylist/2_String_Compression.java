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
        System.out.println(compression1(str));
        System.out.println(compression2(str));
	}
	
	public static String compression1(String str) {
		
        String s = "";
		s += str.charAt(0);
		for(int i=1; i<str.length(); i++){
			if(str.charAt(i)!=str.charAt(i-1)){
				s += str.charAt(i); 
			}
		}

        return s;
    }

    public static String compression2(String str) {
        
		String s ="";
		s += str.charAt(0);
		int count = 1;
		for(int i=1; i<str.length(); i++){
			if(str.charAt(i)==str.charAt(i-1)){
				count++;
			}else if(str.charAt(i)!=str.charAt(i-1)){
				if(count > 1){
					s += count;
					count=1;
				}
				s += str.charAt(i);
			}
		}
		
		if(count > 1) {
			s += count;
			count=1;
		}

        return s;
    }
}

















