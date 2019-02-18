package com.codingblocks.CuxDec;

import java.util.Scanner;

public class PrintPrimes {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int n = 2;
        while(n <= N){
            int k =0;
            int i = 2;
            while (i * i <= n) {
                if (n % i == 0) {
                    k = 1;
                }

                i++;
            }
            if(k == 0){
                System.out.println(n);
            }
            n++;
        }

    }
}
