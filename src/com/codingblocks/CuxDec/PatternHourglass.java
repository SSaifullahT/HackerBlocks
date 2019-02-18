package com.codingblocks.CuxDec;

import java.util.Scanner;

public class PatternHourglass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
    }
    private static void pattern(int n){

        for (int i = 0; i < n; i++) {
            int k = n - i;
            for (int j = 0; j < i; j++) {
                System.out.print(" "+ " ");
            }
            for (int j = 2 * (n - i) + 1; j > 0 ; j--) {
                System.out.print(k +" ");
                if(j > n - i + 1){
                    k--;
                }
                else {
                    k++;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" "+ " ");
        }
        System.out.println("0");

        for (int i = 0; i < n; i++) {
            int k = i + 1;
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" "+ " ");
            }
            for (int j = 0; j < 2 * (i + 1) + 1; j++) {
                System.out.print(k + " ");
                if(j < i + 1){
                    k--;
                }
                else {
                    k++;
                }
            }
            System.out.println();
        }
    }
}
