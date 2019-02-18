package com.codingblocks.CuxDec;

import java.util.Scanner;

public class PatternInvertedHourGlass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
    }
    private static void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(n - j + " ");
            }
            for (int j = 2 * (n - i) - 1; j > 0; j--) {
                System.out.print(" " + " ");
            }
            for (int j = i + 1; j > 0; j--) {
                System.out.print(n - j + 1 + " ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 2 * n; i++) {
            if(i < n){
                System.out.print(n - i + " ");
            }
            else {
                System.out.print(i - n + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(n - j + " ");
            }
            for (int j = 2 * i + 1; j > 0; j--) {
                System.out.print(" " + " ");
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print(n - j + 1 + " ");
            }
            System.out.println();
        }
    }
}
