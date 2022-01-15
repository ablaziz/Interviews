package com.interview.Java;

public class IsPalindrome {
    public static void main(String[] args) {
        String word = "353";
        String reverse ="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+= word.charAt(i);
        }
        if (word.equals(reverse)){
            System.out.println("353 is palindrome");
        }
isPalindromePractice();
    }
    public static void isPalindromePractice() {
        //civic, madam,
        //reverse it
        String word = "civc";
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (word.equals(reverse)) {
            System.out.println("Civic is palindrome");
        }


    }
}