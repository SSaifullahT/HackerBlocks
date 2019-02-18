package com.codingblocks.CuxDec;

import java.util.Scanner;

public class VonNumanLovesBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        binarToInteger(arr);
    }
    private static void binarToInteger(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int a = 0;
            int b = 1;
            while (arr[i] > 0){
                a = a + (arr[i] % 10) * b;
                arr[i] = arr[i] / 10;
                b = b * 2;
            }
            System.out.println(a);
        }
    }
}
