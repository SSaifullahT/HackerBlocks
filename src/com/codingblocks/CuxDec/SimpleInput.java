package com.codingblocks.CuxDec;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int sum = a;
        while(sum > 0) {
            System.out.println(a);
            a = s.nextInt();
            sum = sum + a;
        }

    }

}
