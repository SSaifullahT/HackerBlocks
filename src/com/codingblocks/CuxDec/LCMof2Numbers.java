package com.codingblocks.CuxDec;

import java.util.Scanner;

public class LCMof2Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(LCM(n1, n2));
    }
    private static long LCM1(int n1, int n2)
    {
        int a = 1;
        long r = 1;
        while((a <= n1)&&(a <= n2))
        {
            if(((n1 % a)==0)&&((n2 % a)==0))
            {
                r = r * a;
                n1 = n1 / a;
                n2 = n2 / a;
            }
            else
            if((n1 % a)==0)
            {
                r = r * a;
                n1 = n1 / a;
            }
            else
            if((n2 % a)==0)
            {
                r = r * a;
                n2 = n2 / a;
            }
            a++;
        }
        r = r * n1 * n2;

        return r;
    }
    private static long LCM(int n1, int n2){
        int small;
        int large;
        if(n1 < n2){
            small = n1;
            large = n2;
        }
        else {
            small = n1;
            large = n2;
        }
        for (int i = large ; ; i += large) {
            if(i % small == 0){
                return i;
            }
        }
    }
}
