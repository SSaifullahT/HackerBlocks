package com.codingblocks.CuxDec;

import java.util.Scanner;

public class ReplaceThemAll {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        nums(n);
    }
    private static void nums(long n){
        long place = 1;
        long N = 0;
        if(n == 0){
            System.out.println(5);
        }else {
            while (n > 0) {
                long temp =  n % 10;
                if (temp == 0) {
                    N = N + 5 * place;
                    place = place * 10;
                    n = n / 10;
                } else {
                    N = N + temp * place;
                    place = place * 10;
                    n = n / 10;
                }
            }
            System.out.println(N);
        }
    }
}
