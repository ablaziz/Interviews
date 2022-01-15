package com.interview.Java;

public class PairCloseToZeroPractice {
    public static void main(String[] args) {
        //Find the sum of 2 digit close to zero
        int[] num = {1,5,9,-1,4,2,0,3,1,-1,6};
        int[] result = new int[2];
        int tempSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum =0;
            for (int j = i+1; j < num.length; j++) {
                sum = num[i] + num[j];
                sum=Math.abs(sum);
                if (tempSum>=sum) {
                    tempSum=sum;
                    result[0]=num[i];
                    result[1]=num[j];
                }
            }
        }
        System.out.println("Result = " + result[0] + " and " + result[1]);


    }
}
