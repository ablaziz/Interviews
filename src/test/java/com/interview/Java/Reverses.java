package com.interview.Java;

import java.util.Arrays;
import java.util.Collections;

public class Reverses {
    public static void main(String[] args) {
        String word = "Selenium";
        String reverse = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        System.out.println("reverse = " + reverse);

        int[] num ={1,6,-5,-4,8,9};

        Collections.reverse(Arrays.asList(num));
        System.out.println("Arrays.toString(num) = " + Arrays.toString(num));
        for (int i = num.length-1; i >=0; i--) {

        }

    }
}
