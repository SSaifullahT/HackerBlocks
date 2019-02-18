package com.codingblocks.CuxDec;

import java.util.Scanner;

public class PatternNumberLadder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
    }
    private static void pattern(int n){
        int k = 1;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < i + 1 ; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
