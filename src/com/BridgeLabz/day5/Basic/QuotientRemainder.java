package com.BridgeLabz.day5.Basic;
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the value of Dividend N and divisor n");
        int N = scr.nextInt();
        int n = scr.nextInt();
        int Quotient = N/n;
        int Remainder = N%n;
        System.out.println("Quotient of " + N + " and " + n + " is " + Quotient);
        System.out.println("Remainder of " + N + " and " + n + " is " + Remainder);
    }
}
