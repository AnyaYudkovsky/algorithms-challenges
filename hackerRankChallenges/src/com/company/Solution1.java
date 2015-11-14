package com.company;

import java.util.Scanner;

public class Solution1 {
    /*Problem Statement

You are given a square matrix of size N×N. Can you calculate the absolute difference of the sums across the main diagonal and the secondary diagonal?

Input Format

The first line contains a single integer N. The next N lines contain the rows of N integers describing the matrix.

Output Format

Output a single integer equal to the absolute difference in the sums across the diagonals.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The main diagonal of the matrix is:

11
    5
        -12
Sum across the first diagonal: 11 + 5 - 12 = 4

The secondary diagonal of the matrix is:

        4
    5
10
Sum across the second diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15*/


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n;
        int sum1 = 0, sum2 = 0;

        n = in.nextInt();

        //input
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++){
                int curr = in.nextInt();
                if (i==j){
                    sum1 = sum1 + curr;
                }
                if (j+i==n-1){
                    sum2 = sum2 + curr;
                }
            }
        }

        System.out.println(Math.abs(sum1-sum2) );

    }
}

