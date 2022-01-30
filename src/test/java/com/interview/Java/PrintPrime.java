package com.interview.Java;

public class PrintPrime {
    //Prime numbers are divisible by one and themselves
    public static void main(String[] args) {
        //

        //TODO: CREATE A METHOD THAT RETURNS TRUE IF IT IS A PRIME NUMBER

        int[] num ={1,2,3,8,9,5,3,11,20,25};

        for (int i = 2; i < num.length; i++) {
            boolean isPrime = true;
            
            for (int divisor = 2; divisor < i; divisor++) {
                if (i % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
        if (isPrime) {
            System.out.print(i + " ");
        }

        }

    }

}
