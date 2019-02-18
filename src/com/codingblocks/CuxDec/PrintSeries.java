package com.codingblocks.CuxDec;

import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        sequence(n1,n2);
    }
    private static void sequence(int n1, int n2){
        int i = 1;
        int k;
        while (n1 > 0){
            k = 3 * i + 2;
            if(k % n2 != 0){
                System.out.println(k);
                n1--;
            }
            i++;
        }
    }
}
