package com.codingblocks.CuxDec;

import java.util.Scanner;

public class FibionaciPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
    }
    private static void pattern(int n){
        int first = 0;
        int second = 1;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(first + " ");
                temp = first + second;
                first = second;
                second = temp;
            }
            System.out.println();
        }
    }
}
