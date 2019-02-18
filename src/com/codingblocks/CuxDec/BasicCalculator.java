package com.codingblocks.CuxDec;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        char ch = 'i';
        while (ch != 'x' && ch !='X') {
            ch = s.next().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                n1 = s.nextInt();
                n2 = s.nextInt();

                switch (ch) {
                    case '+':
                        System.out.println(n1 + n2);
                        break;
                    case '-':
                        System.out.println(n1 - n2);
                        break;
                    case '*':
                        System.out.println(n1 * n2);
                        break;
                    case '/':
                        System.out.println(n1 / n2);
                        break;
                    case '%':
                        System.out.println(n1 % n2);
                        break;
                }
            }else if(ch != 'x' && ch !='X'){
                System.out.println("Invalid operation. Try again.");
            }
        }

    }
}
