package com.anvar.caculatepro;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String phrase1 = sc.nextLine().toUpperCase();

        String[] arrSplit = phrase1.split(" ", 3);

        if (arrSplit.length < 3) {
            throw new NumberFormatException("Не математическая операция");
        }


        String b = arrSplit[1];

        int a = 0;
        int c = 0;


        if (!(Arrays.asList(IndianTest.nums).contains(arrSplit[0])) && !(Arrays.asList(IndianTest.nums).contains(arrSplit[2]))) {
            try {

                a = Integer.parseInt(arrSplit[0]);
                c = Integer.parseInt(arrSplit[2]);
            } catch (NumberFormatException e) {

                throw new Error("т.к. используются одновременно разные системы счисления");
            }


            System.out.println((arCount(a, c, b)));
        } else {

            a = IndianTest.getInteger(IndianTest.nums, arrSplit[0]);
            c = IndianTest.getInteger(IndianTest.nums, arrSplit[2]);


            if (arCount(a, c, b) > 1) {
                System.out.println(IndianTest.intToRoman(arCount(a, c, b)));
            } else throw new Error("т.к. в римской системе нет отрицательных чисел, как и нуля");
        }
    }


    private static int arCount(int a, int c, String b) {

        int result = 0;

        if (b.equals("-")) {
            result = a - c;
        }
        if (b.equals("+")) {
            result = a + c;
        }
        if (b.equals("/")) {
            result = a / c;
        }
        if (b.equals("*")) {
            result = a * c;
        }
        return result;

    }
}

