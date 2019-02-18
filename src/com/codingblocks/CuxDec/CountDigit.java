package com.codingblocks.CuxDec;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int digit = s.nextInt();
        System.out.println(countdigit(n,digit));
    }
    private static int countdigit(int n, int digit){
        int temp;
        int count = 0;
        while (n > 0){
            temp = n % 10;
            if(temp == digit){
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
