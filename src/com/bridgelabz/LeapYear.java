package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        int x = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year =>");
        int year = scanner.nextInt();
        int leap = year % x;
        if (leap == 0) {
            System.out.println("year is leap year");
        } else {
            System.out.println("The " + " year is leap year");

        }

    }
}
