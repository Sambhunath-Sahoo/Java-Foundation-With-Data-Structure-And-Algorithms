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
        
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scn.nextInt();
        }
        displayArr(a, 0);
    }

    public static void displayArr(int[] a, int idx) {
        if(idx == a.length){
            return;
        }
        displayArr(a, idx+1);
		System.out.println(a[idx]);

    }
}