package com.interview.Java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Factorial2 {
    public static void main(String[] args) {
        int num = 4;
        int factorial = 1;
for (int i = 1; i <= num; i++) {
    factorial = factorial * i;
}
        System.out.println(factorial);

//4! = 4*3*2*1
        findMaxAndMin();
        Move0ToBegining();
    }

    public static void findMaxAndMin() {
        int[] num = {1,6,7,9,6,0,7,79,65};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int each:num) {
            if (each > max) {
                max = each;
            }
        }
        for (int each1 : num) {
            if (each1 < min) {
                min = each1;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
    public static void Move0ToBegining() {
        int[] num = {1,6,7,9,6,0,7,79,65,-65};
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < num.length; i++) {
            list.add(num[i]);
        }
        int listWith0Size = list.size();
        //Remove zero
        list.removeAll(Arrays.asList(0));
        int listWithout = list.size();

        int count0 = listWith0Size-listWithout;

        for (int i = 0; i< count0; i++) {
            list.add(0,0);
        }
        System.out.println("list = " + list);
    }

}