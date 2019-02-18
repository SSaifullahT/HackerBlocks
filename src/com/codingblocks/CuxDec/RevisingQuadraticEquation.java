package com.codingblocks.CuxDec;

import java.util.Scanner;

public class RevisingQuadraticEquation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        roots(a,b,c);
    }
    private static void roots(int a, int b, int c){
        double Det;
        Det = Math.pow(b,2) - (4 * a * c);
        if(a == 0){
            System.out.println("Real and Equal");
            int root = -c / b;
            System.out.println(root);
        }
        if(Det < 0){
            System.out.print("Imaginary");
        }else{
            if(Det == 0){
                System.out.println("Real and Equal");
                double root = (double)(-b / (2 * a));
                int Root = (int)Math.round(root);
                System.out.print(Root + " " + Root);
            }
            else {
                System.out.println("Real and Distinct");
                double root1 = ((-b + Math.sqrt(Det)) / (2 * a));
                double root2 = ((-b - Math.sqrt(Det)) / (2 * a));
                int Root1 = (int)Math.round(root1);
                int Root2 = (int)Math.round(root2);
                System.out.print(Root1 + " ");
                System.out.println(Root2 + " ");
            }
        }
    }
}
