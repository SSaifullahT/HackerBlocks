package com.codingblocks.CuxDec;

import java.util.Scanner;

public class NthFibionaciNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int first = 0;
        int second = 1;
        int temp;
        for (int i = 0; i < N ; i++) {
            temp = first + second;
            first = second;
            second = temp;
        }
        System.out.println(first);
    }
}
