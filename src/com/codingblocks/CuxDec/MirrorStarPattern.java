package com.codingblocks.CuxDec;

import java.util.Scanner;

public class MirrorStarPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
    }
    private static void pattern(int n){
        int m = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n / 2 - m; j > 0; j--) {
                System.out.print(" " + " ");
            }
            for (int j = 0; j < 2 * m + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            if(k < n / 2){
                m++;
                k++;
            }
            else {
                m--;
                k++;
            }
        }
    }
}
