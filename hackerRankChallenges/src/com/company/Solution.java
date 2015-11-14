package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
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

    static int solveMeSecond(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n;
        int sum1, sum2;
        List<List<Integer>> inputData = new ArrayList<List<Integer>>();

        n = in.nextInt();

        //input
        for (int i=0;i<n;i++) {
            inputData.add(i, new ArrayList<Integer>());
            for (int j=0;j<n;j++){
                inputData.get(i).add(in.nextInt());
            }
        }

        //print array
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++){
                System.out.print(inputData.get(i).get(j) + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        //print diagonal 1
        for (int i=0;i<n;i++) {
            System.out.print(inputData.get(i).get(i) + " ");
        }

        System.out.println("");

        sum1 = inputData.get(0).get(0);
        for (int i=1;i<n;i++) {
            sum1 = solveMeSecond(sum1, inputData.get(i).get(i));
        }
        System.out.println("sum1 " + sum1);

        //print diagonal 2
        for (int i=0;i<n;i++) {
            System.out.print(inputData.get(i).get(n-i-1) + " ");

        }

        sum2 = inputData.get(0).get(n-1);
        for (int i=1;i<n;i++) {
            sum2 = solveMeSecond(sum2, inputData.get(i).get(n-i-1));

        }
        System.out.println("sum2 " + sum2);

        int diff = Math.abs(sum1-sum2);
        System.out.println("abs diff " + diff );

        System.out.println("");

    }
}
