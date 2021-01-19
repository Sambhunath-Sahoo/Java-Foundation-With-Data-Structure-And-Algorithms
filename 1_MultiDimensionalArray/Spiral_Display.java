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


		int minr = 0;
		int minc = 0;
		int maxr = a.length-1;
		int maxc = a[0].length-1;
		
		int count=0;
		int tno = n*m;
		
		while(count<tno){
			
			for(int i=minr; i<=maxr && count<tno; i++){
				System.out.println(a[i][minc]);
				count++;
			}
			minc++;
			
			for(int i=minc; i<=maxc && count<tno; i++){
				System.out.println(a[maxr][i]);
				count++;
			}
			maxr--;
			
			for(int i=maxr; i>=minr && count<tno; i--) {
				System.out.println(a[i][maxc]);
				count++;
			}
			maxc--;
			
			for(int i=maxc; i>=minc && count<tno; i--) {
				System.out.println(a[minr][i]);
				count++;
			}
			minr++;
		}
		
		
		
	}
}




































