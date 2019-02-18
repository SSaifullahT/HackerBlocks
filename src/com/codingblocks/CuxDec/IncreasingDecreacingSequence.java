package com.codingblocks.CuxDec;

import java.util.Scanner;

public class IncreasingDecreacingSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(check(arr));
    }
    private static boolean check(int[] arr){
       int i = 0;

       while (i < arr.length && arr[i] > arr[i + 1]){
           i++;
       }
       while (i < arr.length - 1 && arr[i] < arr[i + 1]){
           i++;
       }
       if(i == arr.length - 1){
           return true;
       }

        return false;

    }
}
