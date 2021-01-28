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
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        printTargetSumSubsets(a, 0, "", 0, tar);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] a, int idx, String ans, int sum, int tar) {
        if (idx == a.length) {
            if (sum == tar) {
                System.out.println(ans + ".");
            }
            return;
        }

        if (sum > tar) {
            return;
        }

        printTargetSumSubsets(a, idx + 1, ans + a[idx] + ", ", sum + a[idx], tar); // yes
        printTargetSumSubsets(a, idx + 1, ans, sum, tar); // no

    }
}