package com.interview.Java;

public class AndreyTask {

    public static void main(String[] args) {
        int[] num ={1,-5,-6,0,3};
        int sum = 0;
        int previousSum = Integer.MAX_VALUE;
        int num1 = 0;

        int num2 = 0;
        for (int i =0; i < num.length-1; i++ ) {
            //sum = num[i] + num[i+1];
            for (int j = i+1; j < num.length; j++) {
                sum = num[i]+num[j];

                sum = Math.abs(sum);
                if (sum <= previousSum){
                    previousSum = sum;
                    num1 = num[i];
                    num2 = num[j];
                }

            }


        }

        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);
        System.out.println("previousSum = " + previousSum);

        //(-5,5)

    }
}
