package com.codingblocks.CuxDec;

import java.util.Scanner;

public class ShopingGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t ; i++) {
            int m = s.nextInt();
            int n = s.nextInt();

            shopingGame(m,n);
        }

    }
    private static void shopingGame(int m, int n){
        int s_a = 0;
        int s_h = 0;
        int i = 1;
        while (m > s_a && n > s_h){
            s_a = s_a + 2 * i - 1;
            if(s_a >= m){
                break;
            }
            s_h = s_h + 2 * i;
            i++;
        }
        if (s_a >= m && (n - s_h) > 1){
            System.out.println("Harshit");
        }
        else{
            System.out.println("Aayush");
        }
    }

}
