package com.codingblocks.CuxDec;

import java.util.Scanner;

public class BostonNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boston(n);
    }
    private static void boston(int n){
        int s_digit = 0;
        int s_fact = 0;
        int m = n;
        while (m > 0){
            s_digit = s_digit + m % 10;
            m = m / 10;
        }

        int i = 2;
        while (n > 0 && i <= n){
            i = 2;
            while (n % i != 0){
                i++;
            }
            if (n % i == 0) {
                   s_fact = s_fact + i;
                    n = n / i;
            }

        }
        if(s_digit == s_fact){
          System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
