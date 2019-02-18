package com.codingblocks.CuxDec;

import java.util.Scanner;

public class DelhiOddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        oddEven(arr);
    }

    private static void oddEven(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];

            int n1 = 0;
            int n2 = 0;
            while (k > 0){
                 int p = k % 10;
                 k = k / 10;
                 if(p % 2 == 0){
                     n2 = n2 + p;
                 }else {
                     n1 = n1 + p;
                 }

            }
            if(n1 % 3 == 0 || n2 % 4 == 0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
