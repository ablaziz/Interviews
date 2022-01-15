package com.interview.Java;

public class ReturnLast3 {
    //Create a method that will return the last 3 char of a string

    public static String returnLast3() {
        String str = "Abdoulniada";
        String result = "";
        result = str.substring(str.length()-3);

        return result;
    }

    public static void main(String[] args) {
        System.out.println("returnLast3() = " + returnLast3());
    }
}
