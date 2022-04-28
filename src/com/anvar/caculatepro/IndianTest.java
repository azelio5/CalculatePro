package com.anvar.caculatepro;

public class IndianTest {

   static String[] nums =      {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
   static String[] strings =   {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
   static String[] tens =      {"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "XC"};
   static String[] hundreds =  {"","C", "CC", "CCC","CD", "D", "DC", "DCC", "DCCC", "CM"};
   static String[] thousands = {"","M", "MM", "MMM"};

    public static String intToRoman(int arDigit) {
        String result = thousands[arDigit/1000] +
                hundreds[(arDigit % 1000)/100] +
                tens[(arDigit%100) / 10] +
                strings[arDigit % 10];
                return result;
    }

    public static Integer getInteger(String[] nums, String str) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].equals(str)) {
                //System.out.println(i + 1);
                return i + 1;
            }
        }
        return 0;
    }
}
