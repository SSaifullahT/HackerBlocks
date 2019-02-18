package com.codingblocks.CuxDec;

import java.util.Scanner;

public class PatternMountain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
    }
    private static void pattern(int n){
        int k;
        for (int i = 0; i < n - 1; i++) {
            k = 1;
            for (int j = 0; j < i + 1; j++) {
                System.out.print(k + " ");
                k++;
            }
            for (int j = 2 * (n / 2 - i) + 1; j > 0; j--) {
                System.out.print(" " + " ");
            }
            for (int j = 0; j < i + 1; j++) {
                k--;
                System.out.print(k + " ");
            }
            System.out.println();
        }
        k = 1;
        for (int i = 0; i < n; i++) {
                System.out.print(k + " ");
                k++;
        }
        k = n;
        for (int i = 0; i < n - 1; i++) {
            k--;
            System.out.print(k + " ");
        }

    }
}
