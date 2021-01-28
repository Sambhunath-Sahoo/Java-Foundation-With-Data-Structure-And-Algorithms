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
		String str = scn.nextLine();
		
		System.out.println(gss(str));
	}
	
	public static ArrayList<String> gss(String str){
		if(str.length()==0){
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = gss(ros);
		ArrayList<String> mr = new ArrayList<>();
		
		for(int i=0; i<rr.size(); i++){
			mr.add(rr.get(i));
		}
		for(int i=0; i<rr.size(); i++){
			mr.add(ch + rr.get(i));
		}
		return mr;
	}
}