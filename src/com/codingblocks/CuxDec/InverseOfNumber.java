package com.codingblocks.CuxDec;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        inverse(n);
    }

    private static void inverse(int n){
        int number = 0;
        int place = 1;
        int digit;
        while(n > 0){
            digit = n % 10;
            number = number + place * (int)Math.pow(10, digit - 1);
            place++;
            n = n / 10;
        }
        System.out.println(number);
    }
}
