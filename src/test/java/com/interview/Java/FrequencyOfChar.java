package com.interview.Java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String word = "Aziz niada";
        word = word.replace(" ","");
        word = word.toLowerCase();
        Map<Character, Integer> frequency = new HashMap<>();
        for (Character each : word.toCharArray()) {
            if (frequency.containsKey(each)) {
                frequency.put(each, frequency.get(each) + 1);
            } else {
                frequency.put(each,1);
            }
        }
        System.out.println("frequency = " + frequency);
        for (Map.Entry<Character,Integer> entry : frequency.entrySet()) {
            if (entry.getValue()==2) {
                System.out.println("Duplicates are " + entry.getKey());
            }
        }
    printDuplicate();
        printDuplicates();

    }
    public static void printDuplicate() {
        String name = "niada abdoul";
        name = name.replace(" ","").toLowerCase();
        System.out.println("name = " + name);

        Map<Character, Integer> frequencyOfChars = new LinkedHashMap<>();
        for (int i = 0; i < name.length(); i++) {
            char key = name.charAt(i);
            if (frequencyOfChars.containsKey(name.charAt(i))) {
                frequencyOfChars.put(key, frequencyOfChars.get(key)+1);
            } else {
                frequencyOfChars.put(key, 1);
            }
        }
        System.out.println(frequencyOfChars.entrySet());
    }

    public static void printDuplicates() {
        String str = "i need a break";
        str = str.replace(" ","").toLowerCase();

        System.out.println("str = " + str);

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each)+1);
            } else {
                map.put(each,1);
            }
        }
        System.out.println("map = " + map.entrySet());
    }
}
