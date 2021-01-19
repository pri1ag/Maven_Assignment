package com.knoldus;

public class StringFunctions {
    public static String reverse(String word) {
        StringBuilder sb=new StringBuilder(word);
        sb.reverse();
        return sb.toString();
    }
    public static int findLength(String word) {
        return word.length();
    }
}
