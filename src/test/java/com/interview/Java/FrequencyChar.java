package com.interview.Java;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyChar {
    public static void frequencyOfChar(String name) {
        name = name.replace(" ","").toLowerCase();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character each : name.toCharArray()){
            if (map.containsKey(each)) {
                map.put(each, map.get(each)+1);
            } else {
                map.put(each,1);
            }

        }
        System.out.println("map.entrySet() = " + map.entrySet());
    }

    public static void main(String[] args) {
        frequencyOfChar("Abdoul Aziz Niada");
        System.out.println("isPalindrome(\"civic\") = " + isPalindrome("madame"));
    }

    public static boolean isPalindrome(String word) {
        for (int i = 0, lastIndex = word.length()-1; i < word.length()/2; i++,lastIndex--) {
            if (word.charAt(i) != word.charAt(lastIndex)){
                return false;

            }
        }
        return true;
    }
}
