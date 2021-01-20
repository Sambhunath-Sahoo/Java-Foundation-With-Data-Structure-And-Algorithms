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
        System.out.println(firstIndex(a, 0, x));
    }

    public static int firstIndex(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        if (x == arr[idx]) {
            return idx;
        }
        int indexOFele = firstIndex(arr, idx + 1, x);

        return indexOFele;
    }
}