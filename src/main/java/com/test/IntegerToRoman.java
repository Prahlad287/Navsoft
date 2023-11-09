package com.test;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        if (num <= 0 || num > 3999) {
            return "Invalid input";
        }

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (num > 0) {
            if (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            } else {
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	
        int num = scanner.nextInt();
        String romanNumeral = intToRoman(num);
        System.out.println("Roman numeral for " + num + " is: " + romanNumeral);
        
        byte x = 127;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.print(x);
        System.out.println();
        
        int[]  x1 = {120, 200, 016};
        for(int i = 0; i < x1.length; i++){
                 System.out.print(x1[i] + " ");
        }
       
       
    }
}

