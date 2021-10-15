package com.company;

public class Main {

    public static void main(String[] args) {
        byte bt = 120;
        short sh = bt;
        int nm = sh;
        long lg = nm;
        System.out.println("1) " + bt + " -> " + sh + " -> " + nm + " -> " + lg);

        int nm1 = 123324;
        double dbl = nm1;
        System.out.println("2) " + nm1 + " -> " + dbl);

        short sh1 = 4325;
        float fl = sh1;
        double dbl1 = fl;
        System.out.println("3) " + sh1 + " -> " + fl + " -> " + dbl1);

        char chr = 'F';
        int nm2 = chr;
        System.out.println("4) " + chr + " -> " + nm2);

    }
}