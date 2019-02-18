package com.codingblocks.CuxDec;

import java.util.Scanner;

public class SumOfOddEvenPlaces {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int s_odd = 0;
        int s_even = 0;
        while(n > 0){
            s_odd = s_odd + n % 10;
            n = n / 10;
            s_even = s_even + n % 10;
            n = n / 10;
        }
        System.out.println(s_odd);
        System.out.println(s_even);
    }
}
