package com.interview.Java;

public class ReverseString {
    public static void main(String[] args) {
        String word = "ABLAZIZ";
        String reverse = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+= word.charAt(i);
        }
        System.out.println("reverse = " + reverse);
        swap();
    }
    public static void swap() {
        int a = 0;
        int b = -4;
         //swap a and b without temp
        a = a + b; //3 + 4 = 7
        b = a - b; //7 - 4 = 3
        a = a - b; //7 - 3 = 4
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
