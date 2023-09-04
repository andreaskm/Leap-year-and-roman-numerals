package org.example;

import java.util.HashMap;

public class SomethingClass {
    public boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public String intToRoman(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < values.length; i++){
            while (num >= values[i]){
                num -= values[i];
                s.append(numerals[i]);
            }
        }
        return s.toString();
    }

    public int romanToInt (String roman){

        HashMap <Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I',1);
        numbersMap.put('V',5);
        numbersMap.put('X',10);
        numbersMap.put('L',50);
        numbersMap.put('C',100);
        numbersMap.put('D',500);
        numbersMap.put('M',1000);

        int result=0;

        for(int i =0; i <roman.length(); i++){
            char ch = roman.charAt(i);

            if(i>0 && numbersMap.get(ch) > numbersMap.get(roman.charAt(i-1))){
                result += numbersMap.get(ch) - 2*numbersMap.get(roman.charAt(i-1));
            } else {
                result += numbersMap.get(ch);
            }
        }
        System.out.println("Funny");
        return result;
    }
}
