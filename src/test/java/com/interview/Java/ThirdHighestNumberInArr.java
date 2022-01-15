package com.interview.Java;

import java.util.Arrays;

public class ThirdHighestNumberInArr {

    public static void thirdHighest() {
        int size = 10;
        int[] num = new int[size];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random() *50);
        }
        Arrays.sort(num);
        System.out.println("Arrays.toString(num) = " + Arrays.toString(num));
        System.out.println("num[size-3] = " + num[size-3]);

    }

    public static void main(String[] args) {
        thirdHighest();
    }
}
