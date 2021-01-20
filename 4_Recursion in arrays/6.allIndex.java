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
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        int x = scn.nextInt();
        int[] iarr = allIndices(a, 0, x, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int idx, int x, int count) {
        if (idx == arr.length) {
			int a[] = new int[count];
            return a;
        }
		
        if (x == arr[idx]) {
        	count++;
        }
        int rr[] = allIndices(arr, idx + 1, x, count);
		if(arr[idx]==x){
			rr[count-1] = idx;
		}
		return rr;
    }
	
}