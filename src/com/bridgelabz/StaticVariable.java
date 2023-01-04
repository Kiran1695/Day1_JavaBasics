package com.bridgelabz;

// 1.6 Write a program to demonstrate static variables, methods, and blocks.

public class StaticVariable {

    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("static block initialize. ");
        b = a * 6;
    }

    public static void main(String[] args) {
        meth(62);
    }

}
