package com.interview.Java;

import java.util.HashMap;
import java.util.Map;

public class task {
    /**
     * Given String str = “Selenium WebDriver”;
     * a.	Write a java method that finds the number of occurrence of each character in the string.
     */

    public static void main(String[] args) {
        String str = "Selenium WebDriver";

        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (frequency.containsKey(str.charAt(i))) {
                frequency.put(str.charAt(i), frequency.get(str.charAt(i)) + 1);
            } else {
                frequency.put(str.charAt(i), 1);
            }
        }
        System.out.println("frequency.entrySet() = " + frequency.entrySet());


        //Find smallest and largest number in an array
        int[] num = {6, 3, 87, 69, 574};
        int min = 0;
        int max = 0;


    }
}