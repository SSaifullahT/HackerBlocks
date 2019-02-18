package com.codingblocks.CuxDec;

import java.util.Scanner;

public class ConversionFerenhiteToCelcius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = s.nextInt();
        int max = s.nextInt();
        int step = s.nextInt();

        conversion(min, max, step);
    }

    private static void conversion(int min, int max, int steps){
        int f = min;
        while (f <= max){
            int c = (5 * (f - 32) / 9);
            System.out.println(c);
            f = f + steps;
        }
    }
}
