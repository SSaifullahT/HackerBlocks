package com.codingblocks.CuxDec;

import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);

        lowerUpper(ch);

    }

    private static void lowerUpper(char ch){
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        }else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("UPPERCASE");
        }else{
            System.out.println("Invalid");
        }
    }
}
