package com.codingblocks.CuxDec;

import java.util.Scanner;

public class PatternTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
    }
    private static void pattern(int n){
        int k;
        for (int i = 0; i < n; i++) {
            k = i;
            for (int j = n- i -1; j > 0; j--) {
                System.out.print(" " + " ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(k + 1 + " ");
                if(j < i){
                    k++;
                }
                else {
                    k--;
                }
            }
            System.out.println();
        }
        
    }
}
