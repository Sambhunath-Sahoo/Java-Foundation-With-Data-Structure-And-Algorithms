import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        toh(n, n1, n2, n3);
    }

    public static void toh(int n, int start_point, int end_point, int helper) {
        if (n == 0) {
            return;
        }
        toh(n - 1, start_point, helper, end_point);
        System.out.println(n + "[" + start_point + " -> " + end_point + "]");
        toh(n - 1, helper, end_point, start_point);
    }
}