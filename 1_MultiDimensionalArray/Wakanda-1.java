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
		int m = scn.nextInt();
		
		int a[][] = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++){
				a[i][j] = scn.nextInt();
			}
		}


		for(int j=0; j<m; j++){
			if(j%2==0){
				for(int i=0; i<n; i++){
					System.out.println(a[i][j]);
				}
			} else {
				for(int i=a.length-1; i>=0; i--){
					System.out.println(a[i][j]);
				}
			}
		}
		
		
		
	}
}




































