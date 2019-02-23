package com.codingblocks.CuxDec;

import java.util.Scanner;

public class MaximumSum2DArray {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int m = s.nextInt();
            int[][] A = new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    A[j][k] = s.nextInt();
                }
            }
            maxArray(A);
        }
    }
    private static void maxArray(int[][] a){
        int sum = Integer.MIN_VALUE;
        int column = a[0].length;
        int row = a.length;
        int[] result;

        for (int firstcol = 0; firstcol < column; firstcol++) {
            int[] temp = new int[row];
            for (int secondcol = firstcol; secondcol < column; secondcol++) {
                for (int i = 0; i < row; i++) {
                    temp[i] += a[i][secondcol];
                }
                result = maximumSum(temp);
                if(result[0] > sum){
                    sum = result[0];

                }
            }
        }
        System.out.println(sum);
    }

    private static int[] maximumSum(int[] temp){
        int[] result = {Integer.MIN_VALUE, 0, -1};
        int currentSum = 0;
        int localStart = 0;
        for (int i = 0; i < temp.length; i++) {
            currentSum += temp[i];
            if(currentSum < 0) {
                currentSum = 0;
                localStart = i + 1;
            }else if(currentSum > result[0]){
                result[0] = currentSum;
                result[1] = localStart;
                result[2] = i;
            }
        }

        if(result[2] == -1){
            result[0] = 0;
            for (int i = 0; i < temp.length; i++) {
                if(temp[i] > result[0]){
                    result[0] = temp[i];
                    result[1] = i;
                    result[2] = i;
                }
            }
        }
        return result;

    }
}
