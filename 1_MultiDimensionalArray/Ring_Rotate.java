import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scn.nextInt();
            }
        }

        int s = scn.nextInt();
        int r = scn.nextInt();

        int la[] = fill1Dfrom2D(a, s);
        rotate1D(la, r);

        fill2Dfrom1D(a, la, s);


        // Display
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static int[] fill1Dfrom2D(int a[][], int s) {
        int minr = s - 1;
        int maxr = a.length - s;
        int minc = s - 1;
        int maxc = a[0].length - s;
        int c = 0;
        int ans[] = new int[2 * (maxr - minr + 1) + 2 * (maxc - minc + 1) - 4];

        for (int i = minr; i <= maxr; i++) {
            ans[c] = a[i][minc];
            c++;
        }
        minc++;

        for (int i = minc; i <= maxc; i++) {
            ans[c] = a[maxr][i];
            c++;
        }
        maxr--;

        for (int i = maxr; i >= minr; i--) {
            ans[c] = a[i][maxc];
            c++;
        }
        maxc--;

        for (int i = maxc; i >= minc; i--) {
            ans[c] = a[minr][i];
            c++;
        }

        return ans;
    }


    public static void rotate1D(int la[], int r) {
        r = r % la.length;
        if (r < 0) {
            r = r + la.length;
        }
        reverse(la, 0, la.length - 1);
        reverse(la, 0, r - 1);
        reverse(la, r, la.length - 1);
    }


    public static void reverse(int a[], int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }


    public static void fill2Dfrom1D(int a[][], int la[], int s) {
        int minr = s - 1;
        int maxr = a.length - s;
        int minc = s - 1;
        int maxc = a[0].length - s;
        int c = 0;
        int d = 0;

        for (int i = minr; i <= maxr; i++) {
            a[i][minc] = la[c];
            c++;
        }
        minc++;

        for (int i = minc; i <= maxc; i++) {
            a[maxr][i] = la[c];
            c++;
        }
        maxr--;

        for (int i = maxr; i >= minr; i--) {
            a[i][maxc] = la[c];
            c++;
        }
        maxc--;

        for (int i = maxc; i >= minc; i--) {
            a[minr][i] = la[c];
            c++;
        }

    }
}