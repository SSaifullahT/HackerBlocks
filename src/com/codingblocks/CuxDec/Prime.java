package com.codingblocks.CuxDec;

import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 2;
        int k = 1;
        while(i * i <= N){
                if(N % i == 0){
                    k = 0;
                    break;
                }

                i++;
        }
        if(k == 1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }



    }
}
