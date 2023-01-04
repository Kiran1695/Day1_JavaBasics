package com.bridgelabz;

// 1.4 To find the sum of command-line arguments and count the invalid integers entered.

public class CommandLineArguments {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[3]);
        int sum = x + y;
        System.out.println("Sum is " + sum);
    }
}

