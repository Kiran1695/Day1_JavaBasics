package com.bridgelabz;

import java.util.Scanner;

// 1.5 To get the name using the command line.
public class GetTheName {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String str = scanner.next();
        System.out.println("Name: " + str);

    }
}
