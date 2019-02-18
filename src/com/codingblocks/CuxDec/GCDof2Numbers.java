package com.codingblocks.CuxDec;

import java.util.Scanner;

public class GCDof2Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int i;
        if(n1 < n2){
            i =  n1;
        }
        else{
            i = n2;
        }
        while(i > 0 ){
            if(n1 % i == 0 && n2 % i == 0){
                System.out.println(i);
                break;
            }
            i--;
        }
    }
}
