package com.company;

/**
 * Created by anya on 11/14/15.
 */


import java.util.Scanner;

public class Solution2 {

    static long solveMeSecond(long a, long b) {
        return a+b;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n;
        long sum;
        n = in.nextInt();
        sum = in.nextInt();
        for (int i=1;i<n;i++) {
            sum = solveMeSecond(sum, in.nextInt());
        }
        System.out.println(sum);
    }
}