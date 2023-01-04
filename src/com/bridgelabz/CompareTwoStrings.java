package com.bridgelabz;

// 1.3 Write a program to check two strings are equal or not.

import java.util.Scanner;

public class CompareTwoStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = scanner.nextLine();
        System.out.println("Enter the string: ");
        String s2 = scanner.nextLine();

        // compare two strings
        System.out.println("Are the two strings equal?" + s1.equals(s2));
    }
}
