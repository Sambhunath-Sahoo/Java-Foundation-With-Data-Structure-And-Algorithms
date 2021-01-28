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
		
		System.out.println(kpc(str));
	}
	
	public static ArrayList<String> kpc(String str){
		if(str.length()==0){
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		String codes[] = {
            ".;",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tu",
            "vwx",
            "yz"
        };
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = kpc(ros);
		ArrayList<String> mr = new ArrayList<>();
		
		String code = codes[ch - '0'];
		for(int i=0; i<code.length(); i++){
			char c = code.charAt(i);
			for(int j=0; j<rr.size(); j++){
				mr.add(c+rr.get(j));
			}
		}
		
		return mr;
	}
}