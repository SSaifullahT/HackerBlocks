package com.codingblocks.CuxDec;

import java.util.Scanner;

public class ChewbeccaAndNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        numbers(n);
    }
    private static void numbers(long n){
        long a;
        long b = 10;
        long c = n;
        long k;
        long f = 1;
        while(c > 0){
            if(c < 10){
                a = c;
                k = 9 - a;
                if(k != 0 && a > k){
                    n = n - a * f + k * f;
                }
            }else {
                a = c % 10;
                k = 9 - a;
                if (a > k) {

                    n = n - a * f + k * f;
                }
            }
            c = c / 10;

            f = f * 10;
        }
        System.out.println(n);
    }
}
