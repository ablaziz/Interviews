package com.interview.Java;

import java.util.Arrays;

public class PairCloseToZero {
    public static void main(String[] args) {
        int[] num ={1,6,-5,-4,8,9};
        int[] result = new int[2];
        int tempSum = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++){
            int sum =0;
            for (int j = i+1; j < num.length; j++) {
                 sum =num[i]+num[j];
                 sum = Math.abs(sum);
                 if (tempSum>=sum){
                     tempSum = sum;
                     result[0] = num[i];
                     result[1] = num[j];

                 }


                }
            }
        System.out.println("result[0] + \" And \" + result[1] = " + result[0] + " And " + result[1]);
        findPairCloseToZ();
        }
public static void findPairCloseToZ() {
        int size = 10;
        int[] num = new int[size];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random()*100);
        }
    System.out.println("num[] = " +Arrays.toString(num));
        int[] result = new int[2];
        int tempSum = Integer.MAX_VALUE;
        int sum = 0;
    System.out.println("tempSum = " + tempSum);
    for (int i = 0; i < num.length; i++) {
        sum = 0;

        for (int j = i+1; j < 0; j++) {
           sum = num[i] +num[j];
           sum = Math.abs(sum);

           if (tempSum>= sum) {
               tempSum = sum;
               result[0] = num[i];
               result[1] = num[j];
           }
        }
    }
    System.out.println(Arrays.toString(result));
}
    }

