package com.codingblocks.CuxDec;

import java.util.Scanner;

public class ConversionAnyToAny {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sb = s.nextInt();
        int db = s.nextInt();
        int sn = s.nextInt();
        convert(sb, db, sn);
    }

    private static void convert(int sb, int db, int sn){
        int dn = 0;
        int deci = 0;
        int place = 1;
        while (sn > 0){
            deci = deci + (sn % 10) * place;
            place = place * sb;
            sn = sn / 10;
        }

        place = 1;
        while (deci > 0){
            dn = dn + (deci % db) * place;
            deci = deci / db;
            place = place * 10;
        }

        System.out.println(dn);
    }
}
