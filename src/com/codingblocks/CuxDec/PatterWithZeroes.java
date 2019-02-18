package com.codingblocks.CuxDec;

import java.util.Scanner;

public class PatterWithZeroes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
    }
    private static void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i) {
                    System.out.print(i + 1 + " ");
                }
                else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();

        }
    }
}
