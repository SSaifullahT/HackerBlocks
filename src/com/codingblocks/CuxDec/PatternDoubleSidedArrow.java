package com.codingblocks.CuxDec;

import java.util.Scanner;

public class PatternDoubleSidedArrow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
    }
    private static void pattern(int n){
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n - 2 * k - 1; j > 0; j--) {
                System.out.print(" " + " ");
            }
            for (int j = k + 1; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < 2 * k - 1; j++) {
                System.out.print(" " + " ");
            }
            if(i != 0 && i != n - 1) {
                for (int j = 0; j < k + 1; j++) {
                    System.out.print(j + 1 + " ");
                }
            }
            System.out.println();
            if(i < n / 2){
                k++;
            }
            else {
                k--;
            }
        }
    }
}
