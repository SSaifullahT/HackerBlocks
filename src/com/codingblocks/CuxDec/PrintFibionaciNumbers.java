package com.codingblocks.CuxDec;

import java.util.Scanner;

public class PrintFibionaciNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int first = 0;
        int second = 1;
        int temp;
        while (first < N){
            System.out.println(first);
            temp = first + second;
            first = second;
            second = temp;
        }
    }
}
