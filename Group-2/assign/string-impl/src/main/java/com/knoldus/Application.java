package com.knoldus;

import java.util.Scanner;

public class Application {
    public static void main(String... x)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your string : ");
        String word = sc.nextLine();
        System.out.println("Your reverse string is :"+ StringFunctions.reverse(word));
        System.out.println("Your length of string is :"+StringFunctions.findLength(word));
    }
}
