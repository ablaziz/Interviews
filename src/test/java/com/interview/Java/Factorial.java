package com.interview.Java;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int factorialNum = 1;

        for(int i = 1; i <= num; i++) {
            factorialNum = factorialNum * i;
        }

        System.out.println("factorial of " + num + " is " + factorialNum);
    }
}
