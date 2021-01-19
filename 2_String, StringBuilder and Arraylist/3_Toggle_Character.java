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
		System.out.println(toggleCase(str));
    }
	
	public static String toggleCase(String str){
		StringBuilder sb = new StringBuilder(str);
		
		for(int i=0; i<sb.length(); i++){
			if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') {
				char ch =  (char)('A' + sb.charAt(i) -'a');
				sb.setCharAt(i, ch); 
			} else {
				char ch = (char)('a' + sb.charAt(i) - 'A');
				sb.setCharAt(i, ch);
			}
		}
		return sb.toString();
	}
}

















